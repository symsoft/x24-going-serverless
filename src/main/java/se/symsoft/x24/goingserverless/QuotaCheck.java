/*
 * Copyright Symsoft AB 1996-2015. All Rights Reserved.
 */
package se.symsoft.x24.goingserverless;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cloudwatch.AmazonCloudWatchAsyncClient;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.PutMetricDataRequest;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class QuotaCheck {

    public static final String CONTINUE = "CONTINUE";
    public static final String RELEASE = "RELEASE";

    public static final String SMS_TOPIC_ARN = "arn:aws:sns:eu-west-1:571908524012:x24_sms";

    private static final Table blockTable;
    private static final Gson gson = new Gson();

    private static final AmazonSNSClient snsClient;


    static {
        AmazonDynamoDBClient client = new AmazonDynamoDBClient();
        client.setRegion(Region.getRegion(Regions.EU_WEST_1));
        DynamoDB dynamoDB = new DynamoDB(client);
        blockTable = dynamoDB.getTable("x24_block_status");

        snsClient = new AmazonSNSClient();
        snsClient.setRegion(Region.getRegion(Regions.EU_WEST_1));


    }



    public static String handleRequest(Request request, Context context) {


        try {
            String msisdn = request.getSubmit().getOrigAddrValue();
            if (isBlocked(msisdn)) {
                return RELEASE;
            }
            publish(request);
            return CONTINUE;
        } catch (Exception e) {
            return RELEASE;
        }
    }


    public static boolean isBlocked(String msisdn) {


        Item item = blockTable.getItem("msisdn", msisdn);
        if (item == null) {
            return false;
        }
        if (System.currentTimeMillis() - item.getLong("blockTime") > 60000) {
            blockTable.deleteItem("msisdn", msisdn);
            return false;
        }
        return true;
    }

    public static void publish(Request request) {

        PublishRequest publishRequest = new PublishRequest(SMS_TOPIC_ARN, gson.toJson(request));
        PublishResult publishResult = snsClient.publish(publishRequest);
    }




}

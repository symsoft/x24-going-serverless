/*
 * Copyright Symsoft AB 1996-2015. All Rights Reserved.
 */
package se.symsoft.x24.goingserverless;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.AttributeUpdate;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.UpdateItemOutcome;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuotaUpdate implements RequestHandler<SNSEvent, Object> {
    private static final int LIMIT = 5;
    static Gson gson = new Gson();
    static Table countTable;

    private static final Table blockTable;

    static {
        AmazonDynamoDBClient client = new AmazonDynamoDBClient();
        client.setRegion(Region.getRegion(Regions.EU_WEST_1));
        DynamoDB dynamoDB = new DynamoDB(client);
        //get countTable reference
        countTable = dynamoDB.getTable("x24_quota_count");
        blockTable = dynamoDB.getTable("x24_block_status");
    }



    public Object handleRequest(SNSEvent request, Context context){

        List<SNSEvent.SNSRecord> records = request.getRecords();

        for (SNSEvent.SNSRecord record : records) {
            processMessage(gson.fromJson(record.getSNS().getMessage(), Request.class));
        }

        return null;
    }

    private void processMessage(Request request) {
        Item item = countTable.getItem("msisdn", request.getSubmit().getOrigAddrValue());
        if (item == null) {
            item = new Item().withPrimaryKey("msisdn", request.getSubmit().getOrigAddrValue()).
                    withInt("count", 1).
                    withLong("countResetTime", System.currentTimeMillis());
            countTable.putItem(item);
        } else {
            if (System.currentTimeMillis() - item.getLong("countResetTime") > 60000) {
                countTable.updateItem("msisdn", request.getSubmit().getOrigAddrValue(),
                        new AttributeUpdate("count").put(1),
                        new AttributeUpdate("countResetTime").put(System.currentTimeMillis()));
            } else if (item.getInt("count") >= LIMIT -1) {
                Item blockItem = new Item().withPrimaryKey("msisdn", request.getSubmit().getOrigAddrValue()).
                        withLong("blockTime", System.currentTimeMillis());
                blockTable.putItem(blockItem);
            } else {

                Map<String, String> expressionAttributeNames = new HashMap<>();
                expressionAttributeNames.put("#c", "count");

                Map<String, Object> expressionAttributeValues = new HashMap<>();
                expressionAttributeValues.put(":val", 1);

                UpdateItemOutcome outcome = countTable.updateItem(
                        "msisdn", request.getSubmit().getOrigAddrValue(),
                        "set #c = #c + :val",
                        expressionAttributeNames,
                        expressionAttributeValues);
            }
        }
    }
}
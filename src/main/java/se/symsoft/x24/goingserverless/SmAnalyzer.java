/*
 * Copyright Symsoft AB 1996-2015. All Rights Reserved.
 */
package se.symsoft.x24.goingserverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class SmAnalyzer {

    public static final String CONTINUE = "CONTINUE";
    public static final String RELEASE = "RELEASE";


    /*
    public static String handleRequest(InputStream request, OutputStream response, Context context) {
        LambdaLogger logger = context.getLogger();

        JsonParser parser = new JsonParser();
        JsonObject inputObj;
        try {
            inputObj = parser.parse(IOUtils.toString(request)).getAsJsonObject();
        } catch (IOException e) {
            logger.log("Error while reading request\n" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }

        if (inputObj == null || inputObj.get("action") == null || inputObj.get("action").getAsString().trim().equals("")) {
            logger.log("Invald inputObj, could not find action parameter");
            throw new RuntimeException("Could not find action value in request");
        }
        JsonObject body = (JsonObject) inputObj.get("body");
        return "Successfully created " + body.get("msisdn");
    }

    */

    public static void main(String[] args) {
        JsonParser parser = new JsonParser();
        String str = "RELEASE\n{\n\"class\": \"se.symsoft.nobill.smexternalcontrol.json.ReleaseErrorCode\",\n\"errorCode\": 40\n}";
        System.out.println(str);
        JsonElement obj = parser.parse(str);
        System.out.println(obj);
    }

    public static String handleRequest(Request request, Context context) {
        return CONTINUE;
    }




}

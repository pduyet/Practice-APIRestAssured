package model;

import com.google.gson.Gson;

public class CreateJson {
    public static String POSTM  () {
        Gson gson = new Gson();
        JsonBody jsonBody = new JsonBody();
        jsonBody.setUserId(2);
        jsonBody.setId(2);
        jsonBody.setTitle("the req title");
        jsonBody.setBody("the req body");
        return gson.toJson(jsonBody);
    }
}

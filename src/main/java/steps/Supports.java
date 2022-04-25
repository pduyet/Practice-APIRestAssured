package steps;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Supports {
    public static Response sendPost(String basePath, Object body) {
        return given().basePath(basePath).header("Content-Type", "application/json").when().body(body).post();
    }

    public static Response sendGet(String basePath) {
        return given().basePath(basePath).header("Content-Type", "application/json").when().get();
    }

    public static Response sendPut(String basePath, Object body) {
        return given().basePath(basePath).header("Content-Type", "application/json").header("Accept", "application/json").when().body(body).put();
    }

    public static Response sendDelete(String basePath) {
        return given().basePath(basePath).when().delete();
    }
}

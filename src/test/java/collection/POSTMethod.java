package collection;

import com.google.gson.Gson;
import constant.Element;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.CreateJson;
import model.JsonBody;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class POSTMethod {
    public static Response postToDo() {
        String payload = CreateJson.POSTM();
        Response response = given()
                .baseUri(Element.BaseURI)
                .basePath(Element.Post)
                .contentType(ContentType.JSON)
                .when()
                .body(payload)
                .post();
        return response;
    }

    public static int getId() {
        return postToDo().jsonPath().getInt("id");
    }


}

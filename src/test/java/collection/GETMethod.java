package collection;

import constant.Element;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class GETMethod {
    public static Response getToDo() {
        Response response = RestAssured.given()
                .baseUri(Element.BaseURI)
                .basePath(Element.Todos)
                .get("/" + 1);
        if (response.statusCode() != 200) {
            Assert.fail("Request get fail");
        }
        return response;
    }
}

package collection;

import constant.Element;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class GETMethod {
    public static Response getToDo() {
        Response response = given()
                .baseUri(Element.BaseURI)
                .basePath(Element.Todos)
                .get("/" + 1);
        if (response.statusCode() != 200) {
            Assert.fail("Request get fail");
        }
        return response;
    }

    public static Response getPetID(String id) {
        Response res = given()
                .baseUri(Element.BaseSwaggerURI)
                .basePath(Element.BasePathGetPet.replace("pet_id", id)) //"9223372000001082917"
                .when()
                .get();
//        if (res.statusCode() != 200) {
//            Assert.fail("Request get fail");
//        }
        return res;
    }
}

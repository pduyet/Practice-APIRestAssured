package collection;

import constant.Element;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.CreateJson;

import static io.restassured.RestAssured.given;

public class PUTMethod {
    public static Response updateInformationPet() {
        Response res = given()
                .baseUri(Element.BaseSwaggerURI)
                .basePath(Element.BasePathPet)
                .contentType(ContentType.JSON)
                .body(CreateJson.jsonUpdatePet())
                .when()
                .put();
        return res;
    }
}

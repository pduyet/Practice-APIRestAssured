package collection;

import constant.Element;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DELETEMethod {
    public static void deletePet(String id) {
        Response res = given()
                .baseUri(Element.BaseSwaggerURI)
                .basePath(Element.BasePathDeletePet.replace("pet_id", id))
                .header("api_key", "1")
                .delete();

    }
}

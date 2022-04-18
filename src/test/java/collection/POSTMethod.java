package collection;

import constant.Element;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.CreateJson;
import utilities.Utilities;

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
        System.out.println(response.statusCode());
        return response;
    }

    public static Response creatYourPet() {
        String payload = CreateJson.jsonCreatePet();
        Response res = given()
                .baseUri(Element.BaseSwaggerURI)
                .basePath(Element.BasePathPet)
                .contentType(ContentType.JSON)
                .when()
                .body(payload)
                .post();
        System.out.println(res.statusCode());
        return res;
    }

    public static Response createBooking() {
        String payload = CreateJson.jsonCreateBooking(Utilities.getDateFormat(-2), Utilities.getDateFormat(2));
        Response res = given()
                .baseUri(Element.BaseBookingURI)
                .basePath(Element.Booking)
                .contentType(ContentType.JSON)
                .when()
                .body(payload)
                .post();
        System.out.println(res.statusCode());
        return res;
    }

}

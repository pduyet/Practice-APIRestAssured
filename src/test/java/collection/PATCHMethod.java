package collection;

import constant.Element;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PATCHMethod {
    public static Response patchBooking() {
        Response res = given()
                .baseUri(Element.BaseBookingURI)
                .basePath(Element.BookingID)
                .patch();
        return res;
    }
}

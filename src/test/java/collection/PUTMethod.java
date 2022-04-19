package collection;

import constant.Element;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.CreateJson;
import model.JsonBodyBooking;

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

    public static Response updateInformationBooking(String id) {
        JsonBodyBooking.BookingDates bookingDates = new JsonBodyBooking.BookingDates("2020-01-01", "2020-02-01");
        JsonBodyBooking json = new JsonBodyBooking("Duyet1", "Pham1", 200, true, bookingDates, "Dinner");
        Response res = given()
                .baseUri(Element.BaseBookingURI)
                .contentType(ContentType.JSON)
                .body(json)
                .when()
                .put(Element.bookingID.replace("bookingID", id));
        return res;
    }
}

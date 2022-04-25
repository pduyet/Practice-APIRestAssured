package collection;

import constant.Element;
import io.restassured.response.Response;
import steps.Supports;

public class GETMethod extends Supports {
    public static Response getToDo() {
//        Response response = given()
//                .baseUri(Element.BaseURI)
//                .basePath(Element.Todos)
//                .get("/" + 1);
//        if (response.statusCode() != 200) {
//            Assert.fail("Request get fail");
//        }
//        return response;
        return sendGet(Element.Todos + "/1");
    }

    public static Response getPetID(String id) {
//        Response res = given()
//                .baseUri(Element.BaseSwaggerURI)
//                .basePath(Element.BasePathGetPet.replace("pet_id", id)) //"9223372000001082917"
//                .when()
//                .get();
////        if (res.statusCode() != 200) {
////            Assert.fail("Request get fail");
////        }
//        return res;
        return sendGet(Element.BasePathGetPet.replace("pet_id", id));
    }

    public static Response getBookingID(String id) {
//        Response res = given()
//                .baseUri(Element.BaseBookingURI)
//                .basePath(Element.bookingID.replace("bookingID", id))
//                .when()
//                .get();
//        return res;
        return sendGet(Element.BookingID.replace("bookingID", id));
    }
}

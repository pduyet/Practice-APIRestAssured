package collection;

import com.google.gson.Gson;
import constant.Element;
import io.restassured.response.Response;
import model.CreateJson;
import model.JsonBodyBooking;
import utilities.Utilities;

import static steps.Supports.sendPut;
import static utilities.JsonUtilities.convertJsonToString;

public class PUTMethod {
    public static Response updateInformationPet() {
        String payload = CreateJson.jsonUpdatePet();
        return sendPut(Element.BasePathPet, payload);
    }

    public static Response updateInformationBooking(String id) {
        JsonBodyBooking.BookingDates bookingDates = new JsonBodyBooking.BookingDates("2020-01-01", "2020-02-01");
        JsonBodyBooking json = new JsonBodyBooking("Duyet1", "Pham1", 200, true, bookingDates, "Dinner");
        return sendPut(Element.BookingID.replace("bookingID", id), json);
    }
}

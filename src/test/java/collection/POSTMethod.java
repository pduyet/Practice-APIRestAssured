package collection;

import constant.Element;
import io.restassured.response.Response;
import model.CreateJson;
import steps.Supports;
import utilities.Utilities;

public class POSTMethod extends Supports {
    public static Response postToDo() {
        String payload = CreateJson.POSTM();
        return sendPost(Element.Post, payload);
    }

    public static Response creatYourPet() {
        String payload = CreateJson.jsonCreatePet();

        return sendPost(Element.BasePathPet, payload);
    }

    public static Response createBooking() {
        String payload = CreateJson.jsonCreateBooking(Utilities.getDateFormat(-2), Utilities.getDateFormat(2));
        System.out.println(payload);
        return sendPost(Element.Booking, payload);
    }

}

package model;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class CreateJson {

    public static String POSTM() {
        Gson gson = new Gson();
        JsonBody jsonBody = new JsonBody();
        jsonBody.setUserId(2);
        jsonBody.setId(2);
        jsonBody.setTitle("the req title");
        jsonBody.setBody("the req body");
        return gson.toJson(jsonBody);
    }

    public static String jsonCreatePet() {
        Gson gson = new Gson();
        JsonBodyPet jsonBodyPet = new JsonBodyPet();
        JsonBodyPet.Category category = new JsonBodyPet.Category();
        JsonBodyPet.Tags tag = new JsonBodyPet.Tags();
        List<String> ptUrls = new ArrayList<>();
        List<JsonBodyPet.Tags> tags = new ArrayList<>();
        tags.add(tag);
        ptUrls.add("string");
        jsonBodyPet.setId(0);
        jsonBodyPet.setCategory(category);
        category.setId(0);
        category.setName("string");
        jsonBodyPet.setName("doggie");
        jsonBodyPet.setPhotoUrls(ptUrls);
        jsonBodyPet.setTags(tags);
        tag.setId(0);
        tag.setName("string");
        jsonBodyPet.setStatus("available");
        return gson.toJson(jsonBodyPet);
    }

    public static String jsonUpdatePet() {
        Gson gson = new Gson();
        JsonBodyPet jsonBodyPet = new JsonBodyPet();
        JsonBodyPet.Category category = new JsonBodyPet.Category();
        JsonBodyPet.Tags tag = new JsonBodyPet.Tags();
        List<String> ptUrls = new ArrayList<>();
        List<JsonBodyPet.Tags> tags = new ArrayList<>();
        tags.add(tag);
        ptUrls.add("string");
        jsonBodyPet.setId(0);
        jsonBodyPet.setCategory(category);
        category.setId(0);
        category.setName("string");
        jsonBodyPet.setName("corgi");
        jsonBodyPet.setPhotoUrls(ptUrls);
        jsonBodyPet.setTags(tags);
        tag.setId(0);
        tag.setName("string");
        jsonBodyPet.setStatus("available");
        return gson.toJson(jsonBodyPet);
    }

    public static String jsonCreateBooking(String checkIn, String checkOut) {
        Gson gson = new Gson();
        JsonBodyBooking json = new JsonBodyBooking();
        json.setFirstname("Duyet");
        json.setLastname("Pham");
        json.setTotalprice(1000);
        json.setDepositpaid(true);
        JsonBodyBooking.BookingDates bookingDates = new JsonBodyBooking.BookingDates();
        bookingDates.setCheckin(checkIn);
        bookingDates.setCheckout(checkOut);
        json.setBookingdates(bookingDates);
        json.setAdditionalneeds("Breakfast");
        return gson.toJson(json);
    }
}

package test;

import collection.GETMethod;
import collection.PUTMethod;
import constant.Element;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.JsonUtilities;
import utilities.Listener;
import utilities.Utilities;

import java.util.ArrayList;
import java.util.List;

import static collection.POSTMethod.createBooking;

@Listeners(Listener.class)
public class HerokuBookingTests {
    @BeforeMethod
    public void setUp() {
        RestAssured.baseURI = Element.BaseBookingURI;
    }
    static List<String> listID = new ArrayList<>();

    @Test(priority = 1)
    public void createABooking() {
        System.out.println("Create Booking");
        String res = createBooking().asPrettyString();
        System.out.println(res);
        String idBooking = JsonUtilities.jsonValue(res, "bookingid");
        listID.add(idBooking);
    }

    @Test(priority = 2)
    public void getABooking() {
        System.out.println("Get Booking");
        int id = Utilities.randomNumber(listID.size());
        GETMethod.getBookingID(listID.get(id)).prettyPrint();
    }

    @Test(priority = 3)
    public void putABooking() {
        System.out.println("Update Booking");
        int id = Utilities.randomNumber(listID.size());
        PUTMethod.updateInformationBooking(listID.get(id)).prettyPrint();
    }
}

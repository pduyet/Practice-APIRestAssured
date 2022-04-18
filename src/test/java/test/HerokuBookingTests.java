package test;

import org.testng.annotations.Test;

import static collection.POSTMethod.createBooking;

public class HerokuBookingTests {
    @Test
    public void createABooking() {
        System.out.println("Create Booking");
        createBooking().prettyPrint();
    }
}

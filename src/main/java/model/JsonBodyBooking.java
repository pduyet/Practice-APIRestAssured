package model;

import lombok.Data;

@Data
public class JsonBodyBooking {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;

    @Data
    public static class BookingDates {
        private String checkin;
        private String checkout;
    }
}

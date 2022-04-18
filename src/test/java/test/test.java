package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dt);
        calendar.add(Calendar.DATE, 1);
        Date afterDate = calendar.getTime();
        String time = df.format(afterDate);

    }
}

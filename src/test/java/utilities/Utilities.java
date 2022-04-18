package utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Utilities {
    public static String getTimeNow() {
        DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        return dtfm.format(now);
    }

    public static int randomNumber(int num) {
        Random rd = new Random();
        return rd.nextInt(num);
    }

    public static String getDateFormat(int numberDay) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dt);
        calendar.add(Calendar.DATE, numberDay);
        Date afterDate = calendar.getTime();
        return df.format(afterDate);
    }
}

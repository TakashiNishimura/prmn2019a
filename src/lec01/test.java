package lec01;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class test {

    static  Date time;
    static Random random = new Random();

    static int rand() {
        return random.nextInt(5);
    }

    static Date date() {
        time = new Date();
        try {
            var r = new Robot();
            r.delay(1000);
        } catch (AWTException e) {}
        return time;
    }

    static void val(int v) {
            v = 2;
    }

}

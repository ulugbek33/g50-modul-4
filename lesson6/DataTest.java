package lesson6;

import java.util.Calendar;
import java.util.Date;

public class DataTest {
    public static void main(String[] args) {

        Date date=new Date();
        System.out.println(date);

        Calendar start=Calendar.getInstance();
       start.set(2018,
               0,1,0,0);

    }
}

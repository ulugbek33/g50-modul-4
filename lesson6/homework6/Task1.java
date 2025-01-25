package lesson6.homework6;

import java.util.Calendar;

public class Task1 {

    public static void main(String[] args) {

         Calendar calendar=Calendar.getInstance();

         int day= calendar.get(Calendar.DAY_OF_MONTH);
         int month= calendar.get(Calendar.MONTH)+1;
         int year=calendar.get(Calendar.YEAR);

         int hour=calendar.get(Calendar.HOUR_OF_DAY);
         int minute=calendar.get(Calendar.MINUTE);
         int sekund=calendar.get(Calendar.SECOND);

        System.out.println("Joriy sana= "+day+"-"+month+"-"+year);
        System.out.println("Joriy vaqt= "+hour+"-"+minute+"-"+sekund);
          }
}

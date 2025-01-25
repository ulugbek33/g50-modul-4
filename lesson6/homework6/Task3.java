package lesson6.homework6;

import java.time.LocalDate;
import java.time.Period;

public class Task3 {

    public static void main(String[] args) {

        int year = 2005;
        int month = 12;
        int day = 8;
        LocalDate inputDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        Period age=Period.between(inputDate,currentDate);
        System.out.printf("Siz %d yosh, %d oy, %d kunliksiz.%n",age.getYears(),age.getMonths(),age.getDays());

    }



}

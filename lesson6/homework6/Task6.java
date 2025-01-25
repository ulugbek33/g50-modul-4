package lesson6.homework6;

import java.time.LocalDate;

public class Task6 {

    public static void main(String[] args) {

        LocalDate localDate=LocalDate.now();

        System.out.println("Joriy yil="+localDate.getYear());
        System.out.println("Kabisa yilimi ="+(localDate.isLeapYear()?"Ha":"Yoq"));
        System.out.println("Yilning davomiyligi="+(localDate.isLeapYear()?365:366)+" kun");
    }
}

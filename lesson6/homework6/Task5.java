package lesson6.homework6;

import java.time.LocalDate;

public class Task5 {

    public static void main(String[] args) {
        month();
    }

    public static void month() {

        LocalDate localDate = LocalDate.now();
        System.out.println("Joriy yilda qolgan oylar soni=" + (12 - localDate.getMonthValue()));
    }
}

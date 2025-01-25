package lesson6.homework6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task4 {

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {

        LocalDate currentDate = LocalDate.now();
        LocalDate nextSunday = currentDate.with(DayOfWeek.SUNDAY);
        LocalDate previousSunday = currentDate.with(nextSunday.minusWeeks(1));
        System.out.println("Oldingi yakshanba=" + previousSunday.format(DateTimeFormatter.ofPattern("yyyy:MM:dd")));
        System.out.println("Keyingi yakshanba=" + nextSunday.format(DateTimeFormatter.ofPattern("yyyy:MM:dd")));
    }
}

package lesson6.homework6;

import java.time.LocalTime;

public class Task2 {

    private int hour;

    public static void main(String[] args) {

        String userTime = "10:30:23";
        String difference = calculateTime(userTime);
        System.out.println("Vaqtlar farqi=" + difference);

    }

    public static String calculateTime(String usertime) {
        LocalTime inputTime = LocalTime.parse(usertime);

        LocalTime currentTime = LocalTime.now();


        int hoursDiff = currentTime.getHour() - inputTime.getHour();
        int minutesDiff = currentTime.getMinute() - inputTime.getMinute();
        int secondsDiff = currentTime.getSecond() - inputTime.getSecond();

        if (secondsDiff < 0) {
            secondsDiff += 60;
            minutesDiff--;
        }
        if (minutesDiff < 0) {
            minutesDiff += 60;
            hoursDiff--;
        }
        return String.format("%2d:%2d:%2d", hoursDiff, minutesDiff, secondsDiff);
    }
}

package lesson6;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTast {
    public static void main(String[] args) {

        int weekdays = 5;
        int weekdayHours = 6;
        int sundayHours = 8;


        LocalDate startDate = LocalDate.of(2021, 3, 16);
        LocalDate currentDate = LocalDate.now();

        int count = 0;

        LocalDate date = startDate;
        while (!date.isAfter(currentDate)) {
            count++;
            date = date.plusDays(1);
        }
        int weeks = count / 7;
        int remainingDays = count % 7;

        int sumDays = (weeks * (weekdays * weekdayHours + sundayHours));

        date = startDate.plusDays(count - remainingDays);

        for (int i = 0; i < remainingDays; i++) {
            if (date.getDayOfWeek().getValue() <= 5)
                sumDays += weekdayHours;
            else if (date.getDayOfWeek().getValue() == 7) {
                sumDays += sundayHours;
            }
            date = date.plusDays(1);
        }
        System.out.println("Jamshid jami=" + sumDays + "-->soat ishlagan");
    }
}

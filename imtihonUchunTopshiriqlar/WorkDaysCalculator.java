package imtihonUchunTopshiriqlar;

import java.time.*;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

class WorkDaysCalculator {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(23);

        Future<Integer> workDaysFuture = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                int workDays = 0;
                LocalDate startdate = LocalDate.of(1990, 1, 1);
                LocalDate endDate = LocalDate.of(2024, 1, 1);
                for (LocalDate date = startdate; date.isBefore(endDate); date = date.plusDays(1)) {
                    if (isWorkDay(date))
                        workDays++;
                }
                return workDays;
            }

            public boolean isWorkDay(LocalDate date) {
                DayOfWeek day = date.getDayOfWeek();
                return day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
            }
        });
        Future<Integer> isLeapYearFuture = executor.submit(new Callable<>() {
            @Override
            public Integer call() {
                int isLeapYear = 0;
                for (int year = 1990; year < 2024; year++) {
                    if (isLeapYears(year))
                        isLeapYear++;
                }
                return isLeapYear;
            }

            private static boolean isLeapYears(int year) {
                return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            }
        });
        try {
            System.out.println("Ish kunlar soni=" + workDaysFuture.get());
            System.out.println("Komissiya yillari=" + isLeapYearFuture.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();


    }

}
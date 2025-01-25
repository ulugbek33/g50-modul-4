package lesson6.homework6;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Task9 {

    public static void main(String[] args) {
        Set<String> zonId= ZoneId.getAvailableZoneIds();

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        for (String zona : zonId) {
            ZonedDateTime zonedDateTime=ZonedDateTime.now(ZoneId.of(zona));
            System.out.println(zona+" :"+zonedDateTime.format(dateTimeFormatter));
        }
    }
}

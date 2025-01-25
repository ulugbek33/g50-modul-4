package lesson4.homevork4;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Task3Test {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);

        System.out.println("Vaqt");
        service.schedule(() -> System.out.println(new Date()), 5, TimeUnit.SECONDS);

    }
}

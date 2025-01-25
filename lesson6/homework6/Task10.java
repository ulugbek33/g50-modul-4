package lesson6.homework6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task10 {

    public static void main(String[] args) {

        startTrafficLight();
    }

    public static void startTrafficLight() {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        long end = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(3);
        executor.submit(() -> {
            while (System.currentTimeMillis() < end) {
                dessign(TrafficLight.RED);
                sleep(4000);
                dessign(TrafficLight.YELLOW);
                sleep(3000);
                dessign(TrafficLight.GREEN);
                sleep(5000);
            }
        });
        executor.shutdown();
    }

    public static void dessign(TrafficLight light) {
        switch (light) {
            case RED:
                System.out.println("Stop");
                break;
            case YELLOW:
                System.out.println("Weight");
                break;
            case GREEN:
                System.out.println("Go");
                break;
        }
    }

    public static void sleep(long millisecond) {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < millisecond) {

        }
    }
}

enum TrafficLight {
    RED, YELLOW, GREEN;
}

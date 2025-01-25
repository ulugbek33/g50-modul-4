package lesson4.homevork4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task2Test {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });

        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        long end = System.currentTimeMillis();
        System.out.println("Vaqt=" + (end - start));
    }
}

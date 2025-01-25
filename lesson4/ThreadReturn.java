package lesson4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadReturn {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long begin = System.currentTimeMillis();
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        for (int i = 0; i < 100; i++) {
            executorService.execute(runnable);
        }
        executorService.shutdownNow();
//        executorService.shutdown();
        long end = System.currentTimeMillis();
        System.out.println("Vaqt="+(end - begin));
    }
}

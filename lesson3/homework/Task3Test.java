package lesson3.homework;

import java.util.concurrent.atomic.AtomicReference;

public class Task3Test {


    public static void main(String[] args) throws InterruptedException {

        AtomicReference<Float> reference = new AtomicReference<>(0.0F);
        Runnable task1 = () -> {
            for (int i = 0; i < 500; i++) {
                reference.updateAndGet(Float -> Float + 4);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable task2 = () -> {
            for (int i = 0; i < 500; i++) {
                reference.updateAndGet(Float->Float+4);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        new Thread(task1).start();
        new Thread(task2).start();
        Thread.sleep(2000);

        System.out.println(reference.get());
    }
}

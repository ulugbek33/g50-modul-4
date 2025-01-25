package lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RaseConditionPrablem {

    public static long count = 0;

    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 500; i++) {
            Thread thread = new Thread(() -> {

                try {
                    Thread.sleep(1);
                    count++;

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread.start();
        }
        Thread.sleep(5000);
        System.out.println(count);
    }
}

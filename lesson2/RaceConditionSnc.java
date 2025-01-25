package lesson2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RaceConditionSnc {

    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 500; i++) {
            Thread thread = new Thread(() -> incrumentCountSnc());
            thread.start();
        }
        Thread.sleep(3000);
        System.out.println(count);
    }

    public synchronized static void incrumentCountSnc() {
        try {
            Thread.sleep(1);

            int oldValue = count;
            int newValue = oldValue + 1;
            count = newValue;

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

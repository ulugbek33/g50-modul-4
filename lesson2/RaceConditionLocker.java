package lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RaceConditionLocker {

    public static Lock lock = new ReentrantLock();
    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 500; i++) {
            Thread thread = new Thread(() -> incrumentCountLocker());
            thread.start();
        }
        Thread.sleep(3000);
        System.out.println(count);
    }

    public static void incrumentCountLocker() {
        try {
            lock.lock();
            Thread.sleep(1);

            int oldValue = count;
            int newValue = oldValue + 1;
            count = newValue;

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}

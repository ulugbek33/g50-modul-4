package lesson3.homework;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Task5Test {

    public static void main(String[] args) throws InterruptedException {

        ConcurrentMap<Integer, Integer> map = new ConcurrentHashMap<>();

        Runnable task1 = () -> {
            for (int i = 0; i < 500; i++) {
                map.put(i,i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable task2 = () -> {
            for (int i = 0; i < 500; i++) {
                map.put(i,i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        new Thread(task1).start();
        new Thread(task2).start();
        Thread.sleep(3000);
        System.out.println(map.size());
    }
}

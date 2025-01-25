package lesson3.homework;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Task4Test {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> number=new CopyOnWriteArrayList<>();

        Runnable task1=()->{
            for (int i = 0; i < 500; i++) {
                number.add(i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable task2=()->{
            for (int i = 0; i <500 ; i++) {
                number.add(i);
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
        System.out.println(number.size());
    }
}

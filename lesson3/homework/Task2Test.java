package lesson3.homework;

import java.util.concurrent.atomic.AtomicLong;

public class Task2Test {

    public static AtomicLong count=new AtomicLong(0);

//    public static long count=0;
    public static void main(String[] args) throws InterruptedException {

        Runnable task1=()->{
            for (int i = 0; i <500 ; i++) {
                //count+=2;
               count.updateAndGet(operand -> operand+2);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable task2=()->{
            for (int i = 0; i <500 ; i++) {
                //count+=2;
               count.updateAndGet(operand -> operand+2);
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
        System.out.println(count);
    }
}

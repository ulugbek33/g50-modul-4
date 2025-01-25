package lesson3;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicityTest {

    //    public boolean condation;
//    public static long count = 0;
//    public static AtomicLong count = new AtomicLong(0);
//    public static AtomicReference<Float> count = new AtomicReference<>(0.0F);
//    public static List<Integer> list = new CopyOnWriteArrayList<>();
    public static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        //task1();
//        task2();
//        task3();
//        task4();
//        task5();

    }

    public static void task1() throws InterruptedException {
//        AtomicityTest problem = new AtomicityTest();
//        problem.condation = true;
//        Runnable task = () -> {
//            while (problem.condation) {
//            }
//        };
//        new Thread(task).start();
//        Thread.sleep(2000);
//        problem.condation = false;
//        System.out.println("Problem condation=" + problem.condation);

    }

    public static void task2() throws InterruptedException {
//        for (int i = 0; i < 500; i++) {
//            Thread thread = new Thread(() -> {
//                try {
//                    Thread.sleep(1);
//                    count.addAndGet(2);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//            thread.start();
//        }
//        Thread.sleep(3000);
//        System.out.println(count);
    }

    public static void task3() throws InterruptedException {

//        for (int i = 0; i < 500; i++) {
//            Thread thread1 = new Thread(() -> {
//                try {
//                    Thread.sleep(1);
//                    count.updateAndGet(aFloat -> aFloat + 4);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//            thread1.start();
//        }
//        for (int i = 0; i < 500; i++) {
//            Thread thread2 = new Thread(() -> {
//                try {
//                    Thread.sleep(1);
//                    count.updateAndGet(aFloat -> aFloat + 4);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//            thread2.start();
//        }
//        Thread.sleep(5000);
//        System.out.println(count);
    }

    public static void task4() throws InterruptedException {
//        for (int i = 0; i < 500; i++) {
//            list.add(i);
//            Thread thread = new Thread(() -> {
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//            thread.start();
//        }
//        Thread.sleep(3000);
//        System.out.println(list.size());
    }

    public static void task5() throws InterruptedException {
//        for (int i = 0; i < 500; i++) {
//            map.put(i, i);
//            Thread thread = new Thread(() -> {
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//            thread.start();
//        }
//        Thread.sleep(3000);
//        System.out.println(map.size());
    }


}

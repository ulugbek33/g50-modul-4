package lesson5;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinPullTest {

    public static void main(String[] args) {

        Random random = new Random();
        int[] ints = new int[40_000];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        System.out.println("Array toldi:");
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        long start = System.currentTimeMillis();
        MyRecursiveTask task = new MyRecursiveTask(ints, 200, 0, ints.length);
        Integer invoke = forkJoinPool.invoke(task);
        System.out.println("Vaqt=" + (System.currentTimeMillis() - start));
        System.out.println("ForkJoin result:" + invoke);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        long begin = System.currentTimeMillis();
        executorService.execute(() -> filter(ints));
        executorService.shutdown();
        System.out.println(System.currentTimeMillis()-begin);
        filter(ints);
    }

    public static int filter(int ints[]) {
        int sum = 0;
        for (int anInt : ints) {
            if (anInt % 2 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                sum += anInt;
            }
        }
        return sum;
    }
}

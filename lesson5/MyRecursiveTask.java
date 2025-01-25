package lesson5;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {

    private final int[] array;
    private final int maxForkJoin;
    private final int start;
    private final int end;

    public MyRecursiveTask(int[] array, int maxForkJoin, int start, int end) {
        this.array = array;
        this.maxForkJoin = maxForkJoin;
        this.start = start;
        this.end = end;


    }

    @Override
    protected Integer compute() {
        if (end - start > maxForkJoin) {
            int middle = (start + end) / 2;
            MyRecursiveTask left = new MyRecursiveTask(array, maxForkJoin, start, middle);
            MyRecursiveTask right = new MyRecursiveTask(array, maxForkJoin, middle, end);
            invokeAll(left, right);
            return left.join() + right.join();
        } else {
            int sum=0 ;
            for (int i = start; i < end; i++) {
                if (array[i] %2==0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                   sum+=array[i] ;
                }
            }
            return sum;
        }
    }
}


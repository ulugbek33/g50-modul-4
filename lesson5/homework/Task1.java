package lesson5.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Task1 extends RecursiveTask<List<Integer>> {


    private final int max;
    private final int start;
    private final int end;

    public Task1(int max, int start, int end) {

        this.max = max;
        this.start = start;
        this.end = end;
    }


    @Override
    protected List<Integer> compute() {
        List<Integer> list = new ArrayList<>();

        if (end - start > max) {
            int middle = (start + end) / 2;
            Task1 left = new Task1(max, start, middle);
            Task1 right = new Task1(max, middle, end);
            invokeAll(left, right);

            List<Integer> left1 = left.join();
            List<Integer> right1 = right.join();
            left1.addAll(right1);
            return left1;
        } else {
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    list.add(i);
                }
            }
            return list;
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}

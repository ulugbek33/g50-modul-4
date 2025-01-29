package imtihonUchunTopshiriqlar;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 100; j++) {
                    counter.increment();
                }
            });
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {

        }
        System.out.println("Natija=" + counter.getCount());
        System.out.println("Vaqt="+(System.currentTimeMillis() - start));
    }
}

class Counter {
    private int count;

    public synchronized void increment() {
        count += 2;
    }

    public int getCount() {
        return count;
    }
}

package uz.pdp.lesson2;

/**
 Created by: Mehrojbek
 DateTime: 04/01/25 20:29
 **/
public class RaceConditionProblemWithSync {

    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 500; i++) {

            Runnable runnable = () -> incrementCountWithSync();

            Thread thread = new Thread(runnable);

            thread.start();

        }

        Thread.sleep(7000);

        System.err.println(count);

    }

    public synchronized static void incrementCountWithSync() {
        try {

            Thread.sleep(3);

            //read
            int oldValue = count;

            //modify
            int newValue = oldValue + 1;

            //set
            count = newValue;

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("sjdhcvshg");
        //qulfdan och
    }


    public synchronized void hello() {
        System.out.println("hello");
    }

    public static void incrementCountSimple() {
        try {

            Thread.sleep(1);

            //read
            int oldValue = count;

            //modify
            int newValue = oldValue + 1;

            //set
            count = newValue;

            System.out.println("count: " + count);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

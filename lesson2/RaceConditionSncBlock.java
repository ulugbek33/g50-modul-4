package lesson2;

public class RaceConditionSncBlock {

    public static Object object = new Object();
    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 500; i++) {
            Thread thread = new Thread(() -> incrumentCountSncBlock());
            thread.start();
        }
        Thread.sleep(3000);
        System.out.println(count);
    }

    public static void incrumentCountSncBlock() {
        try {
            synchronized (object) {

                Thread.sleep(1);
                int oldValue = count;
                int newValue = oldValue + 1;
                count = newValue;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package lesson1;

public class ThreadInteruuptTest {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            try {
                for (int i = 0; i < 100_000; i++) {
                    System.out.println(i);
                    Thread.sleep(20);
                }
//                System.out.println(Thread.currentThread().getName() + "ishladi");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread thread = new Thread(runnable, "Runnable:");
        thread.start();
        Thread.sleep(200);
        thread.interrupt();
    }
}

package lesson1;

public class MyThreadExample {
    public static void main(String[] args) {

        Runnable task1 = () -> metod1();
        Runnable task2 = () -> metod2();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        System.out.println("Main metod tugadi:" + Thread.currentThread().getName());
    }


    private static void metod1() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void metod2() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}

package lesson1;

public class DaemonThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Runnable task1 = () -> metod1();
        Runnable task2 = () -> metod2();

        Thread thread1 = new Thread(task1,"Thread1");
        Thread thread2 = new Thread(task2,"Thread2");

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

        Thread.sleep(2000);
        System.out.println("Main metod tugadi:" + Thread.currentThread().getName());
    }


    private static void metod1() {
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+":metod1" );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void metod2() {
        try {
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+":metod2");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

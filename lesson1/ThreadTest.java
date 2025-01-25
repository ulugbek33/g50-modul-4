package lesson1;

public class ThreadTest {
    public static void main(String[] args) {
//        Thread thread = Thread.currentThread();
//        System.out.println(thread);
//
//        System.out.println(Thread.activeCount());
//
//        Thread[] threads = new Thread[Thread.activeCount()];
//
//        Thread.enumerate(threads);
//
//        for (Thread thread1 : threads) {
//            System.out.println(thread1);
//        }

//        MyThread myThread = new MyThread();
//        myThread.setName("Mythread");
//        myThread.start();
//        System.out.println("main thread ");

        MyRunnable myRunnable=new MyRunnable();

        Thread thread=new Thread(myRunnable,"MyRunable");
        thread.start();
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from MyThread: " + Thread.currentThread().getName());
        }
    }

    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello from MyRunnable: " + Thread.currentThread().getName());
        }
    }
}

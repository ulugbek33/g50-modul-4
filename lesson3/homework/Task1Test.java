package lesson3.homework;

public class Task1Test {

    public volatile boolean condition;

    public static void main(String[] args) throws InterruptedException {

        Task1Test problem = new Task1Test();
        problem.condition = true;
        Runnable task = () -> {
            while (problem.condition) {
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(1000);
        problem.condition = false;
        System.out.println("Test");
    }
}

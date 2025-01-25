package lesson4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        transfer("86001", "98605", 20000);
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    public static void transfer(String fromCard, String toCard, long amount) {
        try {
            ExecutorService executorService = Executors.newSingleThreadExecutor();

            Future<Boolean> future1 = executorService.submit(() -> cardCheck(fromCard));
            Future<Boolean> future2 = executorService.submit(() -> cardCheck(toCard));
            Future<Boolean> future3 = executorService.submit(() -> checBalance(fromCard, amount));

            Boolean boolen1 = future1.get();
            Boolean boolen2 = future2.get();
            Boolean boolen3 = future3.get();

            if (boolen1 && boolen2 && boolen3) {
                System.out.println("Transaction...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Transaction completed");
            }
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean cardCheck(String number) {
        try {
            System.out.println("Card checking...");
            Thread.sleep(2000);
            System.out.println("Card checked...");
            return true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean checBalance(String toCard, long amount) {
        try {
            System.out.println("Check balance checking...");
            Thread.sleep(2000);
            System.out.println("Check balance checked...");
            return true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

package lesson4.homevork4;

import javax.swing.plaf.FontUIResource;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
            userService.register();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class User {

}

public class UserService {
    public void register() throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        long start = System.currentTimeMillis();

        Future<User> userFuture = executorService.submit(() -> saveUser());
        Future<String> stringFuture = executorService.submit(() -> generateCode());
        Future<Boolean> booleanFuture = executorService.submit(() -> sendInviteText());

        User user = userFuture.get();
        String code = stringFuture.get();
        Boolean sent = booleanFuture.get();

        long end = System.currentTimeMillis();
        System.out.println("User=" + user);
        System.out.println("Code=" + code);
        System.out.println("Sent=" + sent);
        System.out.println("Vaqt=" + (end - start));
    }

    private Boolean sendInviteText() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    private String generateCode() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Ulugbek1305";
    }

    private User saveUser() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new User();
    }
}
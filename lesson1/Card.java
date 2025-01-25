package lesson1;

public class Card {
    private String cardNumber;
    private double balance;
    private boolean blocked;

    public Card(String cardNumber, double balance, boolean blocked) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.blocked = blocked;
    }

    public double getBalance() {
        return balance;
    }

    public boolean checkBalance(double balance1) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return balance >= balance1;
    }

    public boolean checkBlocked() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return !blocked;
    }

    public boolean transfer(double balance1, Card card) {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        if (checkBalance(balance1) && card.checkBlocked()) {
            balance -= balance1;
            card.balance += balance1;
            return true;
        }
        return false;
    }

    public void Transfer(double balance1, Card card) {

        Thread thread1 = new Thread(String.valueOf(checkBalance(balance1)));
        thread1.start();

        Thread thread2 = new Thread(String.valueOf(checkBlocked()));
        thread2.start();

        Thread thread3 = new Thread(String.valueOf(transfer(balance1, card)));
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}

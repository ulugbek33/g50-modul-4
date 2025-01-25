package lesson1;

public class CardTest {
    public static void main(String[] args) {

        Card card1 = new Card("1234-5678-9012-3456", 100, false);
        Card card2 = new Card("8600-0604-0733-8582", 50, false);

        long before=System.currentTimeMillis();
        if (card1.transfer(20, card2)) {
            System.out.println("Transfer muvafaqqiyatli:");
            System.out.println("Card1 balance:" + card1.getBalance());
            System.out.println("Card2 balance:" + card2.getBalance());
        } else {
            System.out.println("Transfer amalga oshmadi");
        }
        long end=System.currentTimeMillis();
        System.out.println("Time taken="+(end-before));
    }
}

package aqajava.hw9.payment;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addItems("book", 10., 1);
        payment.addItems("card", 2., 1);
        payment.addItems("ruler", 5., 1);
        payment.addItems("eraser", 3., 1);
        payment.addItems("pen", 0.5, 2);
        payment.addItems("pencil", 0.2, 5);

        payment.costDetails();

        Payment payment2 = new Payment("book", 10., 2);
        payment2.addItems("eraser", 3., 3);
        payment2.addItems("cover", 0.1, 10);

        payment2.costDetails();

        Payment payment3 = new Payment();
        Payment.Item item1 = payment3. new Item("paper", 1);
        Payment.Item item2 = payment3. new Item("board game", 56);
        payment3.addItems(item1, 3);
        payment3.addItems(item2, 1);
        payment3.costDetails();
    }
}

package home3.Strategy;

public class Strategy {
    public static void main(String[] args) {
        Order order = new Order(1500);

        order.setPayment(new CardPayment("0000-0000-0000-0000"));
        System.out.println(order.checkout());

        order.setPayment(new CashPayment());
        System.out.println(order.checkout());

        order.setPayment(new BonusPayment(1000));
        System.out.println(order.checkout());
    }
}

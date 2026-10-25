package home3.Strategy;

class Order {
    private double total;
    private PaymentStrategy payment;

    Order(double total) { this.total = total; }

    void setPayment(PaymentStrategy payment) { this.payment = payment; }

    boolean checkout() {
        if (payment == null) throw new IllegalStateException("Выберите способ оплаты");
        return payment.pay(total);
    }
}
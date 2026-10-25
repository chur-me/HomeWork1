package home3.Strategy;

class CashPayment implements PaymentStrategy {
    public boolean pay(double amount) {
        return true;
    }
    public String name() {
        return "Наличными курьеру";
    }
}
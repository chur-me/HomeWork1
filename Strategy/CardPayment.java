package home3.Strategy;

class CardPayment implements PaymentStrategy {
    private String cardNumber;
    CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean pay(double amount) {
        return true;
    }

    public String name() {
        return "Карта";
    }
}
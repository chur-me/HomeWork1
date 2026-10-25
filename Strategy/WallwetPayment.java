package home3.Strategy;

class WallwetPayment implements PaymentStrategy {
    private String wallwetId;
    WallwetPayment(String wallwetId) {
        this.wallwetId = wallwetId;
    }

    public boolean pay(double amount) {
        return true;
    }

    public String name() {
        return "С онлайн кошелька";
    }
}
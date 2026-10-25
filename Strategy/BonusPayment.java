package home3.Strategy;

class BonusPayment implements PaymentStrategy {
    private int points;
    BonusPayment(int points) {
        this.points = points;
    }

    public boolean pay(double amount) {
        return points >= amount;
    }

    public String name() {
        return "Оплата бонусами";
    }
}
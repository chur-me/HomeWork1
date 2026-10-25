package home3.Strategy;

interface PaymentStrategy {
    boolean pay(double amount);
    String name();
}
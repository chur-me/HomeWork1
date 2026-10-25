package home3.Adapter;

class ShtrihM01F {
    void beginCheck() {
        System.out.println("[SHTRIH] Чек открыт");
    }

    void addPosition(String text, double amount) {
        System.out.printf("[SHTRIH] %s = %.2f%n", text, amount);
    }

    double endCheck(double sum) {
        System.out.printf("[SHTRIH] Чек закрыт. Сумма=%.2f%n", sum);
        return 0;
    }
}
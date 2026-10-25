package home3.Adapter;

class Atol30F {
    void openSession() {
        System.out.println("[ATOL] Чек открыт");
    }

    void registerItem(String name, double price, int amt) {
        System.out.printf("[ATOL] %s x%d = %.2f%n", name, amt, price * amt);
    }

    void closeSession(double total, String payType) {
        System.out.printf("[ATOL] Чек закрыт. Сумма=%.2f \n[ATOL] Способ оплаты=%s%n", total, payType);
    }
}
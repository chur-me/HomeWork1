package home3.Adapter;

public class Adapter {
    public static void main(String[] args) {
        String items = "Кофе;2;150\nПирожное;1;200";
        double total = 500;

        new Atol30FAdapter(new Atol30F()).printReceipt(items, total);
        new ShtrihMAdapter(new ShtrihM01F()).printReceipt(items, total);
    }
}

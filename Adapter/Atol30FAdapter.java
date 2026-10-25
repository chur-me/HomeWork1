package home3.Adapter;

class Atol30FAdapter implements FiscalPrinter {
    private final Atol30F p;
    Atol30FAdapter(Atol30F p) { this.p = p; }

    public void printReceipt(String items, double total) {
        p.openSession();
        for (String line : items.split("\n")) {
            String[] x = line.split(";");
            p.registerItem(x[0], Double.parseDouble(x[2]), Integer.parseInt(x[1]));
        }
        p.closeSession(total, "Наличные");
    }
}
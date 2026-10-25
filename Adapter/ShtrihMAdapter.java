package home3.Adapter;

class ShtrihMAdapter implements FiscalPrinter {
    private final ShtrihM01F p;
    ShtrihMAdapter(ShtrihM01F p) { this.p = p; }

    public void printReceipt(String items, double total) {
        p.beginCheck();
        for (String line : items.split("\n")) {
            String[] x = line.split(";");
            double sum = Integer.parseInt(x[1]) * Double.parseDouble(x[2]);
            p.addPosition(x[0], sum);
        }
        p.endCheck(total);
    }
}
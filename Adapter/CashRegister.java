package home3.Adapter;

class CashRegister {
    void checkout(FiscalPrinter printer, String items, double total) {
        printer.printReceipt(items, total);
    }
}
package home3.ChainOfResponsibility;

class ClientReceiptHandler extends OrderHandler {
    void process(Order order) {
        System.out.println("Печать чека клиенту: " + order.total);
    }
}
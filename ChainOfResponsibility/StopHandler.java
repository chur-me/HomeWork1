package home3.ChainOfResponsibility;

class StopHandler extends OrderHandler {
    void process(Order order) {
        if (order.isCancelled()) {
            System.out.println("Заказ отменён — дальше не идём");
        }
    }
}
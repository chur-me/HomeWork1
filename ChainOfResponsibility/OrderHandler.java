package home3.ChainOfResponsibility;

abstract class OrderHandler {
    private OrderHandler next;

    void setNext(OrderHandler next) {
        this.next = next;
    }

    void handle(Order order) {
        process(order);
        if (next != null) next.handle(order);
    }

    abstract void process(Order order);
}
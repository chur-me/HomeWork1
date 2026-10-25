package home3.ChainOfResponsibility;

class KitchenHandler extends OrderHandler {
    void process(Order order) {
        if (order.hasFood()) {
            System.out.println("Печать заказа на кухню: " + order.food);
        }
    }
}
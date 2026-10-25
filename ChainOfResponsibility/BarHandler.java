package home3.ChainOfResponsibility;

class BarHandler extends OrderHandler {
    void process(Order order) {
        if (order.hasDrinks()) {
            System.out.println("Печать заказа на бар: " + order.drinks);
        }
    }
}
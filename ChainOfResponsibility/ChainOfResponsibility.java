package home3.ChainOfResponsibility;

import java.util.Collections;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        Order order = new Order();
        order.total = 500;
        order.food = Collections.singletonList("Бургер, Картошка Фри");
        order.drinks = Collections.singletonList("Кола");

        OrderHandler chain = OrderHandlerFactory.create();
        chain.handle(order);
    }
}

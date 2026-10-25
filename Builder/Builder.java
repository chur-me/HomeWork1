package home3.Builder;

import static home3.Builder.PizzaSize.*;

public class Builder {
    public static void main(String[] args) {
        Pizza.Builder pizza = new Pizza.Builder();
        System.out.println(new Pizza(pizza));

        pizza.size(БОЛЬШАЯ);
        System.out.println(new Pizza(pizza));
    }
}

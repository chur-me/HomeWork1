package home3.ChainOfResponsibility;

import java.util.List;

class Order {
    double total;
    List<String> food;
    List<String> drinks;

    public Order() {

    }

    boolean hasFood()     {
        return !food.isEmpty();
    }

    boolean hasDrinks()   {
        return !drinks.isEmpty();
    }

    public boolean isCancelled() {
        return false;
    }
}
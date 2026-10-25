package home3.Decorator;

public class Cheese extends AddOn {
    Cheese(Food food) {
        super(food);
    }

    @Override
    public double cost() {
        return food.cost() + 5;
    }

    @Override
    public String description() {
        return food.description() + " + сыр";
    }
}

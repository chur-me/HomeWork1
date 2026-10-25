package home3.Decorator;

public class Pickle extends AddOn{
    Pickle(Food food) {
        super(food);
    }

    @Override
    public double cost() {
        return food.cost() + 7.5;
    }

    @Override
    public String description() {
        return food.description() + " + огурчик";
    }
}

package home3.Decorator;

public class ChickenBurger implements Food {
    @Override
    public double cost() {
        return 70;
    }

    @Override
    public String description() {
        return "Чикен Бургер";
    }
}

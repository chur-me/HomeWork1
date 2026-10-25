package home3.Decorator;

public class Burger implements Food {
    @Override
    public double cost() {
        return 80;
    }

    @Override
    public String description() {
        return "Бургер";
    }
}

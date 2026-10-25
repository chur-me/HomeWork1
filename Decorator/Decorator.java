package home3.Decorator;

public class Decorator {
    public static void main(String[] args) {
        Food burger = new Burger();
        burger = new Pickle(burger);
        burger = new Pickle(burger);
        burger = new Cheese(burger);

        System.out.println(burger.description());
        System.out.println(burger.cost());

        Food chikenBurger = new ChickenBurger();
        chikenBurger = new Pickle(chikenBurger);
        chikenBurger = new Pickle(chikenBurger);
        chikenBurger = new Cheese(chikenBurger);

        System.out.println(chikenBurger.description());
        System.out.println(chikenBurger.cost());
    }
}

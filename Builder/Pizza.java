package home3.Builder;

import static home3.Builder.PizzaSize.*;

public class Pizza {
    private final PizzaSize size;
    private final String dough;
    private final boolean cheese;
    private final boolean pepperoni;
    private final String sauce;

    public Pizza(Builder b) {
        this.size = b.size;
        this.dough = b.dough;
        this.cheese = b.cheese;
        this.pepperoni = b.pepperoni;
        this.sauce = b.sauce;
    }

    @Override
    public String toString() {
        String isCheese;
        String isPepperoni;

        if (this.cheese == true){
            isCheese = "с сыром";
        } else isCheese = "без сыра";

        if (this.pepperoni == true){
            isPepperoni = "с пепперони";
        } else isPepperoni = "без пепперони";

        return "Пицца размера " + this.size + " " + isCheese + " " + isPepperoni + ", соус: " + this.sauce + ", тесто: " + this.dough;
    }

    static class Builder {
        private PizzaSize size = МАЛЕНЬКАЯ;
        private String dough = "тонкое";
        private boolean cheese = false;
        private boolean pepperoni = false;
        private String sauce = "томатный";

        Builder size(PizzaSize size)       { this.size = size; return this; }
        Builder dough(String dough)        { this.dough = dough; return this; }
        Builder cheese(boolean cheese)     { this.cheese = cheese; return this; }
        Builder pepperoni(boolean p)       { this.pepperoni = p; return this; }
        Builder sauce(String sauce)        { this.sauce = sauce; return this; }

        Pizza build() {
            return new Pizza(this);
        }
    }
}

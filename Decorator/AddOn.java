package home3.Decorator;

abstract class AddOn implements Food {
    Food food;

    AddOn(Food food) {
        this.food = food;
    }
}

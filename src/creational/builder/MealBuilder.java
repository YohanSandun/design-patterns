package creational.builder;

public class MealBuilder {

    public Meal buildVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new VegPizza());
        return meal;
    }

    public Meal buildNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenPizza());
        meal.addItem(new HamBurger());
        return meal;
    }

}

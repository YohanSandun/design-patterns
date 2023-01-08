package creational.builder;

public class BuilderPatternTest {

    public static void main(String[] args) {

        MealBuilder builder = new MealBuilder();

        Meal meal1 = builder.buildVegMeal();
        meal1.printInvoice();

        System.out.println("\n");

        Meal meal2 = builder.buildNonVegMeal();
        meal2.printInvoice();

    }

}

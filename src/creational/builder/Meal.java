package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (Item item: items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printInvoice() {
        System.out.println("----------INVOICE---------");
        System.out.println("|\t\tITEM\t\t\t|\tPRICE\t|");
        for (Item item: items) {
            System.out.printf("|\t\t%s\t\t|\t%.2f\t|\n", item.getName(), item.getPrice());
        }
        System.out.println("--------------------------");
        System.out.printf("TOTAL : Rs. %.2f\n", getTotal());
        System.out.println("--------------------------");
    }

}

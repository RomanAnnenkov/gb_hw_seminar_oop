package hw_seminar1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private final List<Drink> drinks = new ArrayList<>();
    private double cashOnBoard = 0;

    public CoffeeMachine addDrink(Drink drink) {
        drinks.add(drink);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Баланс: ").append(cashOnBoard).append('\n');
        builder.append("Напитки в наличии: ").append('\n');
        for (Drink drink : drinks) {
            builder.append(drink.toString()).append('\n');
        }
        return builder.toString();
    }

    private Drink searchDrink(String name) {
        for (Drink drink : drinks) {
            if (drink.getName().equals(name)) {
                return drink;
            }
        }
        return null;
    }

    public Drink saleDrink(String name) {
        Drink foundDrink = searchDrink(name);
        if (foundDrink != null) {
            cashOnBoard = cashOnBoard + foundDrink.getPrice();
            drinks.remove(foundDrink);
        }
        return foundDrink;
    }

}

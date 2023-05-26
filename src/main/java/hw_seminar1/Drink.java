package hw_seminar1;

public class Drink {
    private final String name;
    private final double price;
    private final double volumeInLiters;


    public Drink(String name, double price, double volumeInLiters) {
        this.name = name;
        this.price = price;
        this.volumeInLiters = volumeInLiters;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return String.format("Напиток: %s, Цена: %f, Объём: %f", name, price, volumeInLiters);
    }
}

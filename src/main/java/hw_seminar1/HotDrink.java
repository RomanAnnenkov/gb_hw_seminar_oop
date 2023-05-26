package hw_seminar1;

public class HotDrink extends Drink{
    private final int temperatureInCelsius;

    public HotDrink(String name, double price, double volumeInLiters, int temperatureInCelsius) {
        super(name, price, volumeInLiters);
        this.temperatureInCelsius = temperatureInCelsius;
    }

    @Override
    public String toString() {
        return String.format("%s, Температура: %d", super.toString(), temperatureInCelsius);
    }

}

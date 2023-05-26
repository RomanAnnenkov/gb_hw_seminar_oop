package hw_seminar1;

public class MainClassForSeminarOneHW {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.addDrink(new HotDrink("Горячий шоколад", 20, 0.4, 80))
                .addDrink(new HotDrink("Американо", 10, 0.2, 85))
                .addDrink(new HotDrink("Капучино", 10, 0.25, 85));

        System.out.println("---status---");
        System.out.println(coffeeMachine);

        System.out.println("---sale---");
        System.out.println(coffeeMachine.saleDrink("Капучино"));

        System.out.println("---status---");
        System.out.println(coffeeMachine);

    }
}

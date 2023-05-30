package hw_seminar2;

import hw_seminar2.animal.Frog;
import hw_seminar2.animal.Snake;

public class MainClassForSeminarTwoHW {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addAnimal(new Frog("Croaker")).addAnimal(new Snake("Fizzer"));

        System.out.println(terrarium);

        System.out.println("---sounds---");
        System.out.println(terrarium.getSounds());

        System.out.println("--Fastest-swimmer--");
        System.out.println(terrarium.getFastestSwimmer());
    }
}

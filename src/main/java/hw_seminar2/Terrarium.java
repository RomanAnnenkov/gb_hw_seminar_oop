package hw_seminar2;

import hw_seminar2.animal.base.Animal;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private final List<Animal> terrarium = new ArrayList<>();

    public Terrarium addAnimal(Animal animal) {
        terrarium.add(animal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Animals in terrarium:\n");
        for (Animal animal : terrarium) {
            builder.append(animal).append('\n');
        }
        return builder.toString();
    }

    private List<SwimSpeed> getSwimmers() {
        List<SwimSpeed> swimmers = new ArrayList<>();
        for (Animal animal : terrarium) {
            if (animal instanceof SwimSpeed) {
                swimmers.add((SwimSpeed) animal);
            }
        }
        return swimmers;
    }

    public SwimSpeed getFastestSwimmer() {
        List<SwimSpeed> swimmers = getSwimmers();
        SwimSpeed fastestSwimmer = swimmers.get(0);
        for (SwimSpeed swimmer : swimmers) {
            if (swimmer.getSwimSpeed() > fastestSwimmer.getSwimSpeed()) {
                fastestSwimmer = swimmer;
            }
        }
        return fastestSwimmer;
    }

    private List<Soundable> getSoundable() {
        List<Soundable> soundables = new ArrayList<>();
        for (Animal animal: terrarium) {
            if(animal instanceof Soundable) {
                soundables.add((Soundable) animal);
            }
        }
        return soundables;
    }

    public String getSounds() {
        StringBuilder builder = new StringBuilder("Sounds in terrariun:\n");
        for (Soundable animal: getSoundable()) {
            builder.append(animal.makeSound()).append('\n');
        }
        return builder.toString();
    }

}

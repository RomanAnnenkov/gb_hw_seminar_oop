package hw_seminar2.animal;

import hw_seminar2.animal.base.Reptile;

public class Snake extends Reptile {
    public Snake(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Shsssss";
    }

    @Override
    public String feed() {
        return "small rodents";
    }

    @Override
    public String toString() {
        return String.format("Snake: %s, Feed: %s", super.toString(), feed());
    }
}

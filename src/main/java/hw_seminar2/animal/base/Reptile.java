package hw_seminar2.animal.base;

import hw_seminar2.animal.base.Animal;

public abstract class Reptile extends Animal {

    public Reptile(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Reptile: %s", super.toString());
    }
}

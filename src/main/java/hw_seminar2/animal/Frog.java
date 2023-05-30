package hw_seminar2.animal;

import hw_seminar2.SwimSpeed;
import hw_seminar2.animal.base.Amphibian;

public class Frog extends Amphibian implements SwimSpeed {
    public Frog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "croak";
    }

    @Override
    public String feed() {
        return "small insects";
    }

    @Override
    public int getSwimSpeed() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("Frog: %s, Feed: %s, SwimSpeed: %d", super.toString(), feed(), getSwimSpeed());
    }
}

package hw_seminar2.animal;

import hw_seminar2.Soundable;
import hw_seminar2.SwimSpeed;
import hw_seminar2.animal.base.Reptile;

public class Snake extends Reptile implements SwimSpeed, Soundable {
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
        return String.format("Snake: %s, Feed: %s, SwimSpeed: %d", super.toString(), feed(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 2;
    }
}

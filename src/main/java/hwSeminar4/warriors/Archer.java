package hwSeminar4.warriors;

import hwSeminar4.armors.Armor;
import hwSeminar4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, Armor>{
    public Archer(String name, int healthPoint, Ranged weapon, Armor armor) {
        super(name, healthPoint, weapon, armor);
    }

    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }
}

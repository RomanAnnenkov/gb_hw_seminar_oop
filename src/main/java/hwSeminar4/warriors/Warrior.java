package hwSeminar4.warriors;

import hwSeminar4.armors.Armor;
import hwSeminar4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon, A extends Armor> {
    private final String name;
    private int healthPoint;
    private W weapon;
    private A armor;

    public Warrior(String name, int healthPoint, W weapon, A armor) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public A getArmor() {
        return armor;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public void setArmor(A armor) {
        this.armor = armor;
    }

    public int hit() {
        Random rnd = new Random();

        return rnd.nextInt(0, weapon.damage() + 1);
    }

    public void reduceHealth(int damage) {
        damage -= armor.getDefence();
        if (damage < 0) {
            damage = 0;
        }
        healthPoint -= damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, Armor: %s, HealthPoint: %d", name, weapon, armor, healthPoint);
    }
}

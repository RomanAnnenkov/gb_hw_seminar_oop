package hwSeminar4;

import hwSeminar4.warriors.Warrior;

public class Battle {
    private Warrior w1;
    private Warrior w2;

    public Battle(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight(){
        while (w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0){
            int damage1 = w1.hit();
            System.out.printf("%s hit %s : %d ---> ", w1.getName(), w2.getName(), damage1);
            w2.reduceHealth(damage1);
            System.out.printf("%s health - %d\n", w2.getName(), w2.getHealthPoint());
            int damage2 = w2.hit();
            if (isDead(w2)){
                continue;
            }
            System.out.printf("%s hit %s : %d ---> ", w2.getName(), w1.getName(), damage2);
            w1.reduceHealth(damage2);
            System.out.printf("%s health - %d\n", w1.getName(), w1.getHealthPoint());
        }
    }

    private boolean isDead(Warrior w) {
        if (w.getHealthPoint() > 0) {
            return false;
        }
        return true;
    }
}

package warriors;

import interfaces.WarriorClass;

import java.util.Random;

/**
 * Created by ermakov on 21.11.2016.
 */
public class Viking implements WarriorClass {
    private String nameSquad;
    private int myDamage = 120;
    private int myHealth = 100;

    private Random random = new Random(100);
    @Override
    public int attack() {
        return random.nextInt(141);
    }

    @Override
    public void takeDamage(int damage) {
        myHealth -= damage;
    }

    @Override
    public boolean isAlive() {
        return myHealth >= 1;
    }

    @Override
    public void setSquadName(String name) {
        nameSquad = name;
    }

    @Override
    public String toString() {
        return "Имя бойца: " + this.getClass().getSimpleName() +
                "Класс: " + this.getClass().getName() +
                "Отряд: " + this.nameSquad;
    }

    @Override
    public Viking clone() throws CloneNotSupportedException {
        return new Viking();
    }

}
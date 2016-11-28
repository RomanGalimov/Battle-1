package warriors;

import interfaces.Character;

import java.util.Random;

public class Warrior implements Character {
    private String squadName;
    private String myName;
    private int myDamage = 50;
    private int myHealth = 160;

    private Random random = new Random(myDamage - 10);

    public Warrior(String myName) {
        this.myName = myName;
    }

    @Override
    public int attack() {
        return random.nextInt(myDamage + 11);
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
    public String toString() {
        return "Имя бойца: " + this.getMyName() +
                "Класс: " + this.getClass().getName() +
                "Отряд: " + this.getSquadName();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getMyName() {
        return myName;
    }

    public String getSquadName() {
        return squadName;
    }

    @Override
    public void setSquadName(String name) {
        squadName = name;
    }

}

package com.company.players;

public class Golem extends Hero {


    public Golem(int health, int damage) {
        super(health, damage, SuperAbility.TAKES_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (i != 5) {
                heroes[i].setHealth(heroes[i].getHealth() + (boss.getDamage() / 2));
                heroes[5].setHealth(heroes[5].getHealth() - (boss.getDamage() / 2));
            }
        }
        System.out.println("Block golem ");
    }

}

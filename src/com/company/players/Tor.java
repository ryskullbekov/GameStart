package com.company.players;

import java.util.Random;

public class Tor extends Hero {


    public Tor(int health, int damage) {
        super(health, damage, SuperAbility.STUNNING);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
            for (int i = 0; i < heroes.length; i++) {
                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage());
            }
            System.out.println("ability tor");
    }
}

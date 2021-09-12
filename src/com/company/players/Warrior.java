package com.company.players;

import com.company.general.RGP_game;

import java.util.Random;

public class Warrior extends Hero {

private int criticalDamage;

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    public int getCriticalDamage() {
        return criticalDamage;
    }

    public void setCriticalDamage(int criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    @Override
    public void applySuperAbility(Boss boss,Hero[] heroes){
        int koef = RGP_game.random.nextInt(2) + 2;
        boss.setHealth(boss.getHealth() - koef * this.getDamage());
        System.out.println(this.getAbility() + " " + (koef * this.getDamage()));

    }
}

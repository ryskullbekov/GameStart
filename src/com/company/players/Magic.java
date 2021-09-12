package com.company.players;

import com.company.general.RGP_game;

public class Magic extends Hero {

private int boostDamage;

    public Magic(int health, int damage,int boostDamage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss,Hero[] heroes){
        int koef = RGP_game.random.nextInt(8) + 2;
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + koef);
        }
        System.out.println("Magic upDamage " + koef);
    }



    public int getBoostDamage() {
        return boostDamage;
    }

    public void setBoostDamage(int boostDamage) {
        this.boostDamage = boostDamage;
    }
}

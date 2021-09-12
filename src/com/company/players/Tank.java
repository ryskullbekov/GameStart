package com.company.players;

public class Tank extends Hero {


    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss,Hero[] heroes){
                boss.setHealth(boss.getHealth() + boss.getDamage());
                System.out.println("Tank kill: " +( boss.getDamage() + heroes[1].getDamage()));
        }
    }


package com.company.players;

public class Tank extends Hero {

private int tank1;

    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss,Hero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i].getHealth() > 0){
                boss.setHealth(boss.getHealth() - (heroes[i].getDamage() + boss.getDamage() / 2));
                System.out.println("Tank block: " + (heroes[i].getDamage() + boss.getDamage() / 2));
                break;
            }
        }
        }
    }


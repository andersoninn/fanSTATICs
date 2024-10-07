package io.codeforall.bootcamp.gameobject.barrel;

import io.codeforall.bootcamp.gameobject.GameObject;
import io.codeforall.bootcamp.gameobject.destroyable.Destroyable;

public class Barrel extends GameObject implements Destroyable {

    public BarrelType barrelType;
    public int maxHealth;
    public Barrel (){
        this.barrelType = barrelGenerator();
        this.maxHealth = barrelType.getMaxDamage();
    }
     public BarrelType barrelGenerator(){
         int barrelType = (int) Math.random() * BarrelType.values().length + 1;
         switch (barrelType) {
             case 1:
                 BarrelType plastic = BarrelType.PLASTIC;
                 return plastic;
             case 2:
                    BarrelType wood = BarrelType.WOOD;
                 return wood;
             default:
                 BarrelType metal = BarrelType.METAL;
                 return metal;
         }
     }
    @Override
    public String getMessage(){
        return "Barrel created";
    }
    @Override
    public void hit(int damage) {
        maxHealth = maxHealth - damage > 0 ? maxHealth - damage : 0;
    }

    @Override
    public boolean isDestroyable() {
        return maxHealth <= 0;
    }

    @Override
    public String toString() {
        return "Barrel " + barrelType;
    }
}

package io.codeforall.bootcamp.gameobject.barrel;

public enum BarrelType {
    PLASTIC(1),
    WOOD(2),
    METAL(3);
    private int maxDamage;
    BarrelType(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}

package io.codeForAll.fanSTATICs.Heros;

public abstract class AbstractHero implements Hero {

    private String name;
    protected String heroClass;
    private int health;
    private int physicalDamage;
    private int armor;
    private int mana;
    private int cooldown;

    public AbstractHero(String name, int health, int damage, int armor, int mana) {
        this.name = name;
        this.health = health;
        this.physicalDamage = damage;
        this.armor = armor;
        this.mana = mana;
        this.cooldown = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getHeroClass() {
        return heroClass;
    }

    @Override
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(0, health); // Garante que a saúde não seja negativa
    }

    @Override
    public int getPhysicalDamage() {
        return physicalDamage;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = Math.max(0, armor); // Garante que a armadura não seja negativa
    }

    public void increaseArmor(int amount) {
        setArmor(getArmor() + amount); // Aumenta a armadura
    }

    @Override
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = Math.max(0, mana); // Garante que a mana não seja negativa
    }

    @Override
    public int getCooldown() {
        return cooldown;
    }

    @Override
    public void setCooldown(int cooldown) {
        this.cooldown = Math.max(0, cooldown); // Garante que o cooldown não seja negativo
    }

    @Override
    public abstract void useSkill(Hero target);

    public abstract void action(Hero target);
}

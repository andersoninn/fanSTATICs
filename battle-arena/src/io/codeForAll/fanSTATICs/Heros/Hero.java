package io.codeForAll.fanSTATICs.Heros;

public interface Hero {
    String getName();

    String getHeroClass();

    int getHealth();

    int getPhysicalDamage(); // Nome corrigido

    int getArmor();

    int getMana();

    int getCooldown();

    void setCooldown(int cooldown); // Adicionado a interface para clareza

    void useSkill(Hero target);

    void useSkill();

    void receiveDamage(int damageDealt);
}

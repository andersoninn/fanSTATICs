package io.codeForAll.fanSTATICs.Heros;

public class Warrior extends AbstractHero {

    public Warrior(String name, int health, int damage, int armor, int mana) {
        super(name, health, damage, armor, mana);
        this.heroClass = "Warrior";
    }

    @Override
    public void useSkill(Hero target) {
        if (getMana() >= 10) {
            if (getCooldown() == 0) {
                System.out.println(heroClass + " uses Shield Block!");

                // Reduz a mana do Warrior e aplica o cooldown
                setMana(getMana() - 10);
                setCooldown(5);

                // Aumenta a armadura temporariamente
                int armorIncrease = 15; // Valor do aumento de armadura
                increaseArmor(armorIncrease);

                System.out.println("Mana after cast: " + getMana());
                System.out.println(heroClass + " - Armor increased by " + armorIncrease + "!");
                System.out.println(heroClass + " - new cooldown: " + getCooldown());
            } else {
                System.out.println(heroClass + " skill is on cooldown. Turns remaining: " + getCooldown());
            }
        } else {
            System.out.println("Not enough mana to cast Shield Block.");
        }
    }

    @Override
    public void useSkill() {
        // Método vazio para compatibilidade com a interface
    }

    @Override
    public void action(Hero target) {
        useSkill(target);
    }

    public void receiveDamage(int damage) {
        setHealth(getHealth() - damage); // Usa o método setHealth para ajustar o health
        System.out.println("--- " + getName() + " now has " + getHealth() + " health.");
    }
}

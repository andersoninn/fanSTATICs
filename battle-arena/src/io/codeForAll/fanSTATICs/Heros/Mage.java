package io.codeForAll.fanSTATICs.Heros;

public class Mage extends AbstractHero {

    public Mage(String name, int health, int damage, int armor, int mana) {
        super(name, health, damage, armor, mana);
        this.heroClass = "Mage";
    }

    @Override
    public void useSkill(Hero target) {
        if (getMana() >= 10) {
            if (getCooldown() == 0) {
                System.out.println("Mana before cast: " + getMana());
                System.out.println(heroClass + " uses Fireball on " + target.getName() + "!");

                setMana(getMana() - 10); // Reduz a mana do Mage
                setCooldown(5); // Aplica o cooldown

                int damageDealt = getPhysicalDamage();
                target.receiveDamage(damageDealt); // Aplica dano ao alvo
                System.out.println(target.getName() + " takes " + damageDealt + " damage!");

                System.out.println("Mana after cast: " + getMana());
                System.out.println(heroClass + " - new cooldown: " + getCooldown());
            } else {
                System.out.println(heroClass + " skill is on cooldown. Turns remaining: " + getCooldown());
            }
        } else {
            System.out.println("Not enough mana to cast Fireball.");
        }
    }

    @Override
    public void useSkill() {
        // Método vazio
    }

    @Override
    public void action(Hero target) {
        useSkill(target);
    }

    public void receiveDamage(int damage) {
        setHealth(getHealth() - damage); // Usa o método setHealth para ajustar o health
        System.out.println("---" + getName() + " now has " + getHealth() + " health.");
    }
}

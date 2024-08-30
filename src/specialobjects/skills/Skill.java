package src.specialobjects.skills;

import src.characters.Character;

/**
 * Skill
 * 
 * @author Luis Solares
 * @author mdCess
 * @author luis Carlos
 */
public abstract class Skill {

    private String name;
    private int damage;
    private float defense;
    private String attackName;
    private String doubleAttackName;
    private String defenseName;

    public Skill(String name, int damage, float defense, String attackName, String doubleAttackName,
            String defenseName) {
        this.name = name;
        this.damage = damage;
        this.defense = defense;
        this.attackName = attackName;
        this.doubleAttackName = doubleAttackName;
        this.defenseName = defenseName;

    }

    public int attack(Character character) {
        int actualHealth = character.getHealth();
        character.setHealth(actualHealth - damage);
        return actualHealth - damage;
    }

    public int doubleAttack(Character character) {
        return attack(character) + attack(character);
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public float getDefense() {
        return this.defense;
    }

    public String getAttackName() {
        return this.attackName;
    }

    public String getDoubleAttackName() {
        return this.doubleAttackName;
    }

    public String getDefenseName() {
        return this.defenseName;
    }

    @Override
    public String toString() {
        return "Skill Name: " + getName() + "\n" + "Attack Name:" + getAttackName() + "\n" + "Double Attack Name: "
                + getDoubleAttackName() + "Defense Name: " + getDefenseName() + "\n";
    }

}

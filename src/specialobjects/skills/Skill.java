package src.specialobjects.skills;

import src.characters.Character;

/**
 * Skill
 * 
 * Clase abstracta que define una habilidad.
 * 
 * @author Luis Solares
 * @author mdCess
 * @author luis Carlos
 */
public abstract class Skill {

    private String name;
    private int damage;
    private double defense;
    private String attackName;
    private String doubleAttackName;
    private String defenseName;

    /**
     * Realiza un ataque a un personaje.
     * 
     * @param character: el personaje objetivo del ataque
     * @return un mensaje sobre el ataque realizado
     */
    public abstract String attack(Character character);

    /**
     * Realiza un ataque especial a un personaje.
     * 
     * @param character: el personaje objetivo del ataque especial
     * @return un mensaje sobre el ataque especial realizado
     */
    public abstract String doubleAttack(Character character);

    // Getters y Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getDefense() {
        return this.defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public String getAttackName() {
        return this.attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public String getDoubleAttackName() {
        return this.doubleAttackName;
    }

    public void setDoubleAttackName(String doubleAttackName) {
        this.doubleAttackName = doubleAttackName;
    }

    public String getDefenseName() {
        return this.defenseName;
    }

    public void setDefenseName(String defenseName) {
        this.defenseName = defenseName;
    }

    @Override
    public String toString() {
        return "Skill Name: " + getName() + "\n" +
               "Attack Name: " + getAttackName() + "\n" +
               "Double Attack Name: " + getDoubleAttackName() + "\n" +
               "Defense Name: " + getDefenseName() + "\n";
    }
}
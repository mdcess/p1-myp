package src.characters;

import src.specialobjects.SpecialObject;
import src.specialobjects.skills.*;

/**
 * Character
 * 
 * @author Luis Solares
 * @author mdCess
 * @author Luis Carlos
 */
public abstract class Character {

    private String name;
    private int health;
    private Skill skill;

    /**
     * 
     * @param character
     */
    public void attack(Character character) {

    }

    /**
     * 
     * @param character
     */
    public void specialAttack(Character character) {

    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public Skill getSkill() {
        return this.skill;
    }

    // Setters
    public void setHealth(int health) {
        this.health = health;
    }

    public void setSkill(SpecialObject specialObject) {

    }

    @Override
    public String toString() {
        return "Personaje" + this.name + "\n" + "Vida actual: " + this.health + "\n" + "Habilidad Actual: "
                + this.skill.toString();
    }

}
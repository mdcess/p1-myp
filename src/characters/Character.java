package src.characters;

import src.specialobjects.SpecialObject;
import src.specialobjects.skills.*;

/**
 * Character
 * 
 * @author Luis Solares
 * @author mdCess
 */
public abstract class Character {

    private String name;
    private int health;
    private Skill skill;

    public void attack(Character character) {
        this.skill.attack(character);
    }

    public void specialAttack(Character character) {
        this.skill.doubleAttack(character);
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public Skill getSkill() {
        return this.skill;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSkill(SpecialObject specialObject) {

    }

}
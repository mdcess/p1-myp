package src.characters;

import src.specialobjects.SpecialObject;
import src.specialobjects.skills.Skill;

/**
 * Character
 * 
 * Clase base para los personajes que pueden atacar y defenderse.
 * 
 * @author Luis Solares
 * @author mdCess
 * @author Luis Roman
 */
public abstract class Character {

    private String name;
    private int health;
    private Skill skill;

    /**
     * Constructor de Character
     * 
     * @param name:   nombre del personaje
     * @param health: salud inicial del personaje
     * @param skill:  habilidad inicial del personaje
     */
    public Character(String name, int health, Skill skill) {
        this.name = name;
        this.health = health;
        this.skill = skill;
    }

    public Character attack(Character character) {
        character.defend(this.getSkill().getDamage());
        return character;
    }

    public void defend(int damage) {
        int totalDamage = (int) Math.round(this.getHealth() - (damage * this.getSkill().getDefense()));
        this.setHealth(totalDamage);
    }

    // Getters y Setters
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

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public abstract void setSkill(SpecialObject specialObject);

    @Override
    public String toString() {
        return "Personaje " + this.name + "\n" +
                "Vida actual: " + this.health + "\n" +
                "Habilidad Actual: " + this.skill.toString();
    }
}
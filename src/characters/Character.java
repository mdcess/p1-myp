package src.characters;

import src.specialobjects.RareBerry;
import src.specialobjects.ElexirBottle;
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
    private int health = 100;
    private Skill skill;
    private String lastAttack;
    private String lastDefense;

    /**
     * Constructor de Character
     * 
     * @param name:   nombre del personaje
     * @param health: salud inicial del personaje
     * @param skill:  habilidad inicial del personaje
     */
    public Character(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public Character attack(Character character) {
        int finalDamage = character.getHealth();
        this.lastAttack = this.getName() + "atacó a " + character.getName() + " y causó ";
        character.defend(this.getSkill().getDamage());
        finalDamage = finalDamage - character.getHealth();
        this.lastAttack = this.lastAttack + finalDamage + " de daño.";
        return character;
    }

    public Character doubleAttack(Character character) {
        character.defend(this.getSkill().getDamage() * 2);
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

    public String getAttackName() {
        return this.skill.getAttackName();
    }

    public String getDoubleAttackName() {
        return this.skill.getDoubleAttackName();
    }

    public String getDefenseName() {
        return this.skill.getDefenseName();
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public abstract void setSkill(ElexirBottle elexirBottle);

    public abstract void setSkill(RareBerry rareBerry);

    @Override
    public String toString() {
        return "Personaje " + this.name + "\n" +
                "Vida actual: " + this.health + "\n" +
                "Habilidad Actual: " + this.skill.toString();
    }
}
package src.characters;

import src.specialobjects.RareBerry;
import src.specialobjects.SpecialObject;
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
    private String lastConsumption;
    private SpecialObject lastSpecialObject;

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

    public abstract void setSkill(ElexirBottle elexirBottle);

    public abstract void setSkill(RareBerry rareBerry);

    public Character attack(Character character) {
        int finalDamage = character.getHealth();
        this.lastAttack = this.getName() + " atacó a " + character.getName() + " con " + this.getAttackName()
                + " y causó ";
        character.defend(this.getSkill().getDamage(), this.getName());
        finalDamage = finalDamage - character.getHealth();
        this.lastAttack = this.lastAttack + finalDamage + " de daño.";
        return character;
    }

    public Character doubleAttack(Character character) {
        int finalDamage = character.getHealth();
        this.lastAttack = this.getName() + " atacó a " + character.getName() + " con "
                + this.getDoubleAttackName()
                + " y causó ";
        character.defend(this.getSkill().getDamage() * 2, this.getName());
        finalDamage = finalDamage - character.getHealth();
        this.lastAttack = this.lastAttack + finalDamage + " de daño.";
        return character;
    }

    public void defend(int damage, String character) {
        this.lastDefense = this.getName() + " recibio un ataque de " + character + " y se defendio con "
                + this.getDefenseName() + ", redujo el daño en %" + this.skill.getDefense() * 100
                + ", su vida actual es de ";
        int totalDamage = (int) Math.round(this.getHealth() - (damage * this.getSkill().getDefense()));
        this.setHealth(totalDamage);
        this.lastDefense = this.lastDefense + this.getHealth();
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

    public String getLastAttack() {
        return this.lastAttack;
    }

    public String getLastDefense() {
        return this.lastDefense;
    }

    public String getLastConsumption() {
        return this.lastConsumption;
    }

    public SpecialObject getLastSpecialObject() {
        return this.lastSpecialObject;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setLastConsumption(String lastConsumption) {
        this.lastConsumption = lastConsumption;
    }

    public void setLastSpecialObject(SpecialObject specialObject) {
        this.lastSpecialObject = specialObject;
    }

    @Override
    public String toString() {
        return "Personaje " + this.name + "\n" +
                "Vida actual: " + this.health + "\n" +
                "Habilidad Actual: " + this.skill.toString();
    }
}
package src.characters;

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
     * @param name: nombre del personaje
     * @param health: salud inicial del personaje
     * @param skill: habilidad inicial del personaje
     */
    public Character(String name, int health, Skill skill) {
        this.name = name;
        this.health = health;
        this.skill = skill;
    }

    /**
     * Realiza un ataque a otro personaje.
     * 
     * @param character: el personaje objetivo del ataque
     */
    public void attack(Character character) {
        // Realiza el ataque y recibe el mensaje
        String message = this.skill.attack(character);
        System.out.println(message);

        // El objetivo recibe el daño
        int damage = this.skill.getDamage();
        character.receiveDamage(damage);
    }

    /**
     * Maneja la defensa contra un ataque.
     * 
     * @param damage: daño recibido antes de aplicar la defensa
     */
    public void defend(int damage) {
        double defense = this.skill.getDefense();

        // Calcula el daño efectivo después de aplicar la defensa
        double effectiveDamage = damage * (1 - defense);
        this.health -= effectiveDamage;

        // Imprime el mensaje de defensa
        System.out.println(this.name + " se defiende y recibe " + effectiveDamage + " de daño, salud restante: " + this.health);
    }

    /**
     * Reduce la salud del personaje cuando recibe daño.
     * 
     * @param damage: daño recibido
     */
    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            die();
        }
    }

    public void die() {
        System.out.println(this.name + " ha muerto.");
        // Aquí se puede agregar el método para quitar el personaje del campo de batalla
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

    @Override
    public String toString() {
        return "Personaje " + this.name + "\n" +
               "Vida actual: " + this.health + "\n" +
               "Habilidad Actual: " + this.skill.toString();
    }
}
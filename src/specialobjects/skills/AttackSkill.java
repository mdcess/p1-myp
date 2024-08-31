package src.specialobjects.skills;

import src.characters.Character;

/**
 * AttackSkill
 * 
 * Habilidad que realiza ataques más fuertes pero con una defensa menor.
 * 
 * @author Luis Solares
 * @author mdCess
 * @author Luis Román
 */
public class AttackSkill extends Skill {

    /**
     * Constructor de AttackSkill
     * 
     * @param name: nombre de la habilidad
     * @param attackName: nombre del ataque principal
     * @param doubleAttackName: nombre del ataque especial
     * @param defenseName: nombre de la defensa
     */
    public AttackSkill(String name, String attackName, String doubleAttackName, String defenseName) {
        this.setName(name);
        this.setAttackName(attackName);
        this.setDoubleAttackName(doubleAttackName);
        this.setDefenseName(defenseName);
        this.setDamage(20);
        this.setDefense(0.25); // Menor defensa
    }

    @Override
    public String attack(Character character) {
        // Define el mensaje del ataque
        return this.getAttackName() + " ataca a " + character.getName() + " causando " + this.getDamage() + " de daño.";
    }

    @Override
    public String doubleAttack(Character character) {
        // Define el mensaje del ataque especial
        return this.getDoubleAttackName() + " ataca a " + character.getName() + " causando " + (this.getDamage() * 2) + " de daño.";
    }
}
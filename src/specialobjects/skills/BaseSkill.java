package src.specialobjects.skills;

import src.characters.Character;
/**
 * BaseSkill
 * 
 * Habilidad básica que realiza ataques y defensa.
 * 
 * @author Luis Solares
 * @author mdCess
 * @author Luis Román
 */
public class BaseSkill extends Skill {

    /**
     * Constructor de BaseSkill
     * 
     * @param name: nombre de la habilidad
     * @param attackName: nombre del ataque principal
     * @param doubleAttackName: nombre del ataque especial
     * @param defenseName: nombre de la defensa
     */
    public BaseSkill(String name, String attackName, String doubleAttackName, String defenseName) {
        this.setName(name);
        this.setAttackName(attackName);
        this.setDoubleAttackName(doubleAttackName);
        this.setDefenseName(defenseName);
        this.setDamage(10);
        this.setDefense(0.5);
    }

    @Override
    public String attack(Character character) {
        // Aquí defines el mensaje de ataque
        return this.getAttackName() + " ataca a " + character.getName() + " causando " + this.getDamage() + " de daño.";
    }

    @Override
    public String doubleAttack(Character character) {
        // Aquí defines el mensaje del ataque especial
        return this.getDoubleAttackName() + " ataca a " + character.getName() + " causando " + (this.getDamage() * 2) + " de daño.";
    }
}
package src.specialobjects.skills;

import src.characters.Character;

/**
 * DefenseSkill
 * 
 * Habilidad que prioriza la defensa del personaje, aumentando su nivel de defensa, 
 * pero con la desventaja de que decrementa su nivel de ataque.
 * 
 * @author Luis Solares
 * @author mdCess
 * @author Luis Román
 */
public class DefenseSkill extends Skill {

    /**
     * Constructor de DefenseSkill
     * 
     * @param name: nombre de la habilidad
     * @param attackName: nombre del ataque principal
     * @param doubleAttackName: nombre del ataque especial
     * @param defenseName: nombre de la defensa
     */
    public DefenseSkill(String name, String attackName, String doubleAttackName, String defenseName) {
        this.setName(name);
        this.setAttackName(attackName);
        this.setDoubleAttackName(doubleAttackName);
        this.setDefenseName(defenseName);
        this.setDamage(5); // Bajo daño
        this.setDefense(0.75); // Alta defensa
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

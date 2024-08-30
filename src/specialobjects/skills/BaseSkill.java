package src.specialobjects.skills;

/**
 * Base Skill
 * Habilidad básica de todos los personajes.
 * 
 * @author Luis Solares
 * @author mdCess
 */
public class BaseSkill extends Skill {

    /**
     * Contructor de BaseSkill
     * 
     * @param name:             nombre de la habilidad
     * @param attackName:       nombre del ataque principal
     * @param doubleAttackName: nombre del ataque especial
     * @param defenseName:      nombre de la defensa
     */
    public BaseSkill(String name, String attackName, String doubleAttackName, String defenseName) {
        this.setName(name);
        this.setAttackName(attackName);
        this.setDoubleAttackName(doubleAttackName);
        this.setDefenseName(defenseName);
        this.setDamage(10);
        this.setDefense(0.5);
    }

    /**
     * 
     */
    public void attack(Character character) {

    }

    /**
     * 
     */
    public void doubleAttack(Character character) {

    }

}
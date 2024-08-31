package src.specialobjects.skills;

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
     * @param name:             nombre de la habilidad
     * @param attackName:       nombre del ataque principal
     * @param doubleAttackName: nombre del ataque especial
     * @param defenseName:      nombre de la defensa
     */
    public AttackSkill(String name, String attackName, String doubleAttackName, String defenseName) {
        this.setName(name);
        this.setAttackName(attackName);
        this.setDoubleAttackName(doubleAttackName);
        this.setDefenseName(defenseName);
        this.setDamage(20);
        this.setDefense(0.25);
    }

}
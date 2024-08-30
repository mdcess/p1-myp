package src.specialobjects.skills;

/**
 * Base Skill
 * 
 * @author Luis Solares
 * @author mdCess
 */
public class BaseSkill extends Skill {

    public BaseSkill(String name, String attackName, String defenseName) {
        this.setName(name);
        this.setAttackName(attackName);
        this.setDefenseName(defenseName);
        this.setDamage(10);
        this.setDefense(0.5);
    }

}
package src.specialobjects.skills;

/**
 * 
 */
public class AttackSkill extends Skill {

    public AttackSkill(String name, String attackName, String defenseName) {
        this.setName(name);
        this.setAttackName(attackName);
        this.setDefenseName(defenseName);
        this.setDamage(20);
        this.setDefense(0.25);
    }

    public void attack(Character character){

    }

}
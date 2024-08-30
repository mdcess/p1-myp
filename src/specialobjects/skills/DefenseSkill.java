package src.specialobjects.skills;

public class DefenseSkill extends Skill {

    public DefenseSkill(String name, String attackName, String defenseName) {
        this.setName(name);
        this.setAttackName(attackName);
        this.setDefenseName(defenseName);
        this.setDamage(5);
        this.setDefense(0.75);
    }

    public void attack(Character character) {

    }

}

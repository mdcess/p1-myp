package src.specialobjects;

import src.specialobjects.skills.Skill;

/**
 * 
 */
public abstract class SpecialObject {

    private String name;
    private Skill skill;

    public Skill getSkill() {
        return this.skill;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

}
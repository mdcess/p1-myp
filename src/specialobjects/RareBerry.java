package src.specialobjects;

import src.specialobjects.skills.AttackSkill;

/**
 * 
 */
public class RareBerry extends SpecialObject {

    public RareBerry() {
        this.setName("Rare Berry");
        this.setSkill(new AttackSkill("", "", "", ""));
    }

}

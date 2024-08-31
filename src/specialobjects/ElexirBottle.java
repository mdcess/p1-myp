package src.specialobjects;

import src.specialobjects.skills.DefenseSkill;

/**
 * 
 */
public class ElexirBottle extends SpecialObject {

    public ElexirBottle() {
        this.setName("Elexir Bottle");
        this.setSkill(new DefenseSkill("", "", "", ""));
    }

}

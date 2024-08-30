package src.SpecialObject;

public class RazzBerry extends SpecialObject {
    
    public RazzBerry(String name, String pillForm, Skill skill, String color) {
        super(name, pillForm, skill);
    
    }
    @Override
    public String toString() {
        return getNombre() + ", es una " + getPillForm() + "esta hace" + getSkill() + "";
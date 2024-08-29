package src.specialobjects;

public abstract class SpecialObject {
    private String name;
    private String pillForm
    private Skill skill; 

    public SpecialObject(String name, String pillForm, Skill skill){
        this.name=name;
        this.pillForm=pillForm;
        this.skill=skill;
    }

    public String getNombre(){
            return this.name;
    }

    public String getPillForm(){
        return this.pillForm;
    }

    public Skill getSkill(){
        return this.skill;
    }
}

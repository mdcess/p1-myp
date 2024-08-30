package src.specialobjects.skills;

/**
 * Skill
 * 
 * Clase que implementa el comportameinto de una habilidad,
 * con sus ataques y defensas, al igual que el nivel de las
 * mismas.
 * 
 * @author Luis Solares
 * @author mdCess
 * @author luis Carlos
 */
public abstract class Skill {

    private String name;
    private int damage;
    private double defense;
    private String attackName;
    private String doubleAttackName;
    private String defenseName;

    public abstract void attack(Character character);

    public abstract void doubleAttack(Character character);

    // Getters
    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public double getDefense() {
        return this.defense;
    }

    public String getAttackName() {
        return this.attackName;
    }

    public String getDoubleAttackName() {
        return this.doubleAttackName;
    }

    public String getDefenseName() {
        return this.defenseName;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public void setDoubleAttackName(String doubleAttackName) {
        this.doubleAttackName = doubleAttackName;
    }

    public void setDefenseName(String defenseName) {
        this.defenseName = defenseName;
    }

    @Override
    public String toString() {
        return "Skill Name: " + getName() + "\n" + "Attack Name:" + getAttackName() + "\n" + "Double Attack Name: "
                + getDoubleAttackName() + "Defense Name: " + getDefenseName() + "\n";
    }

}

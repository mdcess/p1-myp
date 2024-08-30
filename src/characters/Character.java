package src.characters;

/**
 * Character
 * 
 * @author Luis Solares
 * @author mdCess
 */
public abstract class Character {

    private String name;
    private int health;

    public Character() {

    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
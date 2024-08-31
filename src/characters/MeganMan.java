package src.characters;

import src.specialobjects.SpecialObject;
import src.specialobjects.skills.Skill;

/**
 * MeganMan
 * 
 * @author Luis Solares
 * @author mdCess
 * @author Luis Román
 */
public class MeganMan extends Character implements CopcamSkill {

    /**
     * Constructor de MeganMan
     * 
     * @param name:   nombre del personaje
     * @param health: salud inicial del personaje
     * @param skill:  habilidad inicial del personaje
     */
    public MeganMan(String name, int health, Skill skill) {
        super(name, health, skill); // Llama al constructor de Character
    }

    public void setSkill(SpecialObject specialObject) {

    }

    /**
     * Implementación del método copySkill del interfaz CopcamSkill
     */
    public void copySkill(CopcamSkill character) {
        // Implementación aquí
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
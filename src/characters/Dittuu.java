package src.characters;

import src.specialobjects.SpecialObject;
import src.specialobjects.skills.Skill;

/**
 * Dittuu
 */
public class Dittuu extends Character implements ChingopokomonSkill {

    /**
     * Constructor de Dittuu
     * 
     * @param name:   nombre del personaje
     * @param health: salud inicial del personaje
     * @param skill:  habilidad inicial del personaje
     */
    public Dittuu(String name, int health, Skill skill) {
        super(name, health, skill); // Llama al constructor de Character
    }

    public void setSkill(SpecialObject specialObject) {

    }

    /**
     * Implementación del método copySkill del interfaz ChingopokomonSkill
     */
    public void copySkill(ChingopokomonSkill character) {
        // Implementación aquí
    }
}
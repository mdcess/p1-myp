package src.characters;

import src.specialobjects.*;
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
     * @param name:  nombre del personaje}
     * @param skill: habilidad inicial del personaje
     */
    public MeganMan(String name, Skill skill) {
        super(name, skill);
    }

    public void setSkill(ElexirBottle elexirBottle) {

    }

    public void setSkill(RareBerry rareBerry) {

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
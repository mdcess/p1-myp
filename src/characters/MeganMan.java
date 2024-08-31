package src.characters;

import src.specialobjects.*;
import src.specialobjects.skills.AttackSkill;
import src.specialobjects.skills.DefenseSkill;
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
        this.setSkill(new DefenseSkill("Partes de Robot", "Bara de Metal", "Bara de Metal Electrica",
                "Incremento de partes"));
        this.setLastConsumption(this.getName() + " consumio una " + elexirBottle.getName()
                + ", ahora tiene la habilidad de " + this.getSkill().getName());
        this.setLastSpecialObject(elexirBottle);
    }

    public void setSkill(RareBerry rareBerry) {
        this.setSkill(new AttackSkill("Brazo de Cuchilla", "Corte", "Corte Profundo", "Malla de Metal"));
        this.setLastConsumption(this.getName() + " consumio una " + rareBerry.getName()
                + ", ahora tiene la habilidad de " + this.getSkill().getName());
        this.setLastSpecialObject(rareBerry);
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
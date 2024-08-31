package src.characters;

import src.specialobjects.*;
import src.specialobjects.skills.AttackSkill;
import src.specialobjects.skills.DefenseSkill;
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
    public Dittuu(String name, Skill skill) {
        super(name, skill);
    }

    public void setSkill(ElexirBottle elexirBottle) {
        this.setSkill(new DefenseSkill("Recubrimiento", "Golpe certero", "Escupitajo de acido", "Endurecimiento"));
    }

    public void setSkill(RareBerry rareBerry) {
        this.setSkill(new AttackSkill("Furia", "Golpes consecutivos", "Expansion de dominio", "Escudo de aire"));
    }

    /**
     * Implementación del método copySkill del interfaz ChingopokomonSkill
     */
    public void copySkill(ChingopokomonSkill character) {
        // Implementación aquí
    }
}
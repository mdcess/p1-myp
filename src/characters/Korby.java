package src.characters;

import src.specialobjects.*;
import src.specialobjects.skills.AttackSkill;
import src.specialobjects.skills.DefenseSkill;
import src.specialobjects.skills.Skill;

/**
 * Korby
 * Korby es un personaje popular de la empresa Nientiendo.
 * La característica principal de este personaje es la de
 * replicar habilidades de los enemigos que consume.
 * 
 * @author Luis Solares
 * @author Luis Román
 */
public class Korby extends Character implements NientiendoSkill {

    /**
     * Constructor de Korby
     * 
     * @param name:   nombre del personaje
     * @param health: salud inicial del personaje
     * @param skill:  habilidad inicial del personaje
     */
    public Korby(String name, Skill skill) {
        super(name, skill);
    }

    public void setSkill(ElexirBottle elexirBottle) {
        this.setSkill(new DefenseSkill("Armadura de hierro", "Espadazo", "Espada electrica", "Prision de escudo"));
    }

    public void setSkill(RareBerry rareBerry) {
        this.setSkill(new AttackSkill("Carga de fuego", "Golpe igneo", "Llamarada", "Escudo de fuego"));
    }

    /**
     * Método que permite a Korby copiar una habilidad
     * a personajes de su misma compañía.
     * 
     * @param character: personaje del que Korby copiará su habilidad
     */
    public void copySkill(NientiendoSkill character) {
        // Implementación aquí
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
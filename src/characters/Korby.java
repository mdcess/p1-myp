package src.characters;

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
     * @param name: nombre del personaje
     * @param health: salud inicial del personaje
     * @param skill: habilidad inicial del personaje
     */
    public Korby(String name, int health, Skill skill) {
        super(name, health, skill); // Llama al constructor de Character
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
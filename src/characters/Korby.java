package src.characters;

/**
 * Korby
 * Korby es un personaje popular de la empresa Nientiendo.
 * La caracteristica principal de este personaje es la de
 * replicar habilidades de los enemigos que consume.
 * 
 * @author Luis Solares
 */
public class Korby extends Character implements NientiendoSkill {

    /**
     * Método que permite a Korby copiar una habilidad
     * a personajes de su mis compañia.
     * 
     * @param character: personaje del que Korby copiara su habilidad
     */
    public void copySkill(NientiendoSkill character) {

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
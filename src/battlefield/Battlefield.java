package src.battlefield;

import src.characters.Character;
import src.characters.*;
import src.specialobjects.skills.BaseSkill;

import java.util.LinkedList;

/**
 * Character
 * 
 * 
 */
public class Battlefield implements Subject {

    private LinkedList<Viewer> viewers = new LinkedList<>();
    private LinkedList<Character> fighters = new LinkedList<>();

    public Battlefield() {
        Character Korby = new Korby("Korby",
                new BaseSkill("Mazo", "Mazazo", "Martillazo Destructivo", "Escudo de plasma"));
        Character MeganMan = new src.characters.MeganMan("MeganMan",
                new BaseSkill("Brazo robotico", "Golpe cohete", "Disparo cohete", "Escudo de hierro"));
        Character Dittu = new Dittuu("Dittuu",
                new BaseSkill("Viscosidad", "Punch", "Ataque viscoso", "Escudo de tierra"));

        this.fighters.add(Korby);
        this.fighters.add(MeganMan);
        this.fighters.add(Dittu);
    }

    public void addObserver(Viewer viewer) {

    }

    public void removeObserver(Viewer viewer) {

    }

    public void notifyObservers() {

    }

    public LinkedList<Viewer> getViewers() {
        return this.viewers;
    }

    public LinkedList<Character> getFighters() {
        return this.fighters;
    }

}
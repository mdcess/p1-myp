package src.battlefield;

import src.characters.Character;
import src.characters.*;
import src.specialobjects.skills.BaseSkill;

import java.util.LinkedList;

/**
 * Character
 * 
 * @author Luis Solares
 * @author mdCess
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
        this.viewers.add(viewer);
    }

    public void removeObserver(Viewer viewer) {
        this.viewers.remove(viewer);
    }

    public void notifyObservers(Character attacker, Character advocate) {

        String information;

        for (Viewer xs : viewers) {
            if (xs.getSupport() == attacker.getName()) {
                information = "\nTu personaje " + attacker.getLastAttack() + "\n" + advocate.getLastDefense();
                if (advocate.getHealth() <= 0) {
                    information = information + "\n" + advocate.getName() + " a perdido.";
                    this.fighters.remove(advocate);
                }
                xs.update(information);
            } else if (xs.getSupport() == advocate.getName()) {
                information = "\n" + attacker.getLastAttack() + "\nTu personaje " + advocate.getLastDefense();
                if (advocate.getHealth() <= 0) {
                    information = information + "\nTu personaje " + advocate.getName() + " a perdido.";
                    this.fighters.remove(advocate);
                }
                xs.update(information);
            } else {
                information = "\n" + attacker.getLastAttack() + "\n" + advocate.getLastDefense();
                if (advocate.getHealth() <= 0) {
                    information = information + "\n" + advocate.getName() + " a perdido.";
                    this.fighters.remove(advocate);
                }
                xs.update(information);
            }
        }

    }

    public void notifyObservers(Character character) {

        String information;

        for (Viewer xs : viewers) {
            if (character.getName() == xs.getSupport()) {
                information = "\nTu personaje " + character.getLastConsumption();
                xs.update(information);
            } else {
                information = "\n" + character.getLastConsumption();
                xs.update(information);
            }
        }

    }

    public LinkedList<Viewer> getViewers() {
        return this.viewers;
    }

    public LinkedList<Character> getFighters() {
        return this.fighters;
    }

    public Character getFighter(int i) {
        return this.fighters.get(i);
    }

}
package src.battlefield;

import src.characters.Character;
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
package src.battlefield;

import src.characters.Character;
import java.util.LinkedList;
/**
 * Character
 * 
 * @author Luis Roman
 */
public class Battlefield implements Subject {

    private LinkedList<Viewer> viewers;
    private LinkedList<Character> fighters;

    public Battlefield() {
        this.viewers = new LinkedList<>();
        this.fighters = new LinkedList<>();
    }

    @Override
    public void addObserver(Viewer viewer) {
        viewers.add(viewer);
    }

    @Override
    public void removeObserver(Viewer viewer) {
        viewers.remove(viewer);
    }

    @Override
    public void notifyObservers() {
        for (Viewer viewer : viewers) {
            viewer.update(this);
        }
    }

    // Métodos para manejar viewers
    public void addViewer(Viewer viewer) {
        addObserver(viewer);
        notifyObservers();
    }

    public void removeViewer(Viewer viewer) {
        removeObserver(viewer);
        notifyObservers();
    }

    public LinkedList<Viewer> getViewers() {
        return viewers;
    }


    public void removeFighter(Character fighter) {
        fighters.remove(fighter);
        notifyObservers(); // Notificar a los observadores cuando muere un fighter
    }

    public LinkedList<Character> getFighters() {
        return fighters;
    }

    // Método para mostrar información sobre la batalla
    public void displayBattlefieldStatus() {
        System.out.println("Viewers:");
        for (Viewer viewer : viewers) {
            System.out.println(" - " + viewer);
        }

        System.out.println("Fighters:");
        for (Character fighter : fighters) {
            System.out.println(" - " + fighter.getName() + " (Health: " + fighter.getHealth() + ")");
        }
    }
}
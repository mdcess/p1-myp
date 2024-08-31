package src.battlefield;

import src.characters.Character;
import src.specialobjects.SpecialObject;

public interface Subject {
    void addObserver(Viewer viewer);

    void removeObserver(Viewer viewer);

    void notifyObservers(Character attacker, Character advocate);

    void notifyObservers(Character character);

}
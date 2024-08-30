package src.battlefield;

import src.characters.Character;

public class Viewer implements Observer {

    private String id;
    private Character supportedCharacter;

    public Viewer(String id, Character supportedCharacter) {
        this.id = id;
        this.supportedCharacter = supportedCharacter;
    }

    public String getId() {
        return id;
    }

    public Character getSupportedCharacter() {
        return supportedCharacter;
    }

    @Override
    public void update(Battlefield battlefield) {
        System.out.println("Viewer " + id + " has been notified.");
        battlefield.displayBattlefieldStatus();
    }

    @Override
    public String toString() {
        return "Viewer{id='" + id + "', supportedCharacter=" + supportedCharacter.getName() + "}";
    }
}
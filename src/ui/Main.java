package src.ui;

import src.battlefield.Battlefield;
import src.battlefield.Viewer;
import src.specialobjects.ElexirBottle;

/**
 * 
 */
public class Main {

    private static Battlefield battle = new Battlefield();

    public static void case01() {

        Viewer obs1 = new Viewer("mdCess", "Korby");
        Viewer obs2 = new Viewer("Luis", "MeganMan");
        Viewer obs3 = new Viewer("Lupita", "Dittu");

        battle.addObserver(obs1);
        battle.addObserver(obs2);
        battle.addObserver(obs3);

        battle.getFighter(0).attack(battle.getFighter(1));

    }

    public static void main(String[] args) {
        case01();
    }

}
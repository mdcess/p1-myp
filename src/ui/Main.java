package src.ui;

import src.battlefield.Battlefield;
import src.battlefield.Viewer;
import src.specialobjects.ElexirBottle;
import src.specialobjects.RareBerry;
import src.specialobjects.SpecialObject;

/**
 * Clase Main que inicia con una simulación aleatoria.
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
        battle.notifyObservers(battle.getFighter(0), battle.getFighter(1));

        battle.getFighter(0).doubleAttack(battle.getFighter(1));
        battle.notifyObservers(battle.getFighter(0), battle.getFighter(1));
        battle.getFighter(0).setSkill(new RareBerry());
        battle.notifyObservers(battle.getFighter(0));

        System.out.println(obs1.getBinnacle());
        System.out.println(obs2.getBinnacle());

    }

    private void attack(int i, int o) {
        battle.getFighter(i).attack(battle.getFighter(o));
        battle.notifyObservers(battle.getFighter(i), battle.getFighter(o));
    }

    private void doubleAttack(int i, int o) {
        battle.notifyObservers(battle.getFighter(i), battle.getFighter(o));
    }

    private void consume(int i, SpecialObject specialObject) {
        battle.getFighter(i).setSkill(new RareBerry());
        battle.notifyObservers(battle.getFighter(i));
    }

    public static void main(String[] args) {
        case01();
    }

}
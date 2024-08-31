package src.ui;

import src.battlefield.Battlefield;
import src.battlefield.Viewer;
import src.specialobjects.ElexirBottle;
import src.specialobjects.RareBerry;

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
        battle.notifyObservers(battle.getFighter(0), battle.getFighter(1));
        System.out.println(battle.getFighter(0).getLastAttack());
        System.out.println(battle.getFighter(1).getLastDefense());
        battle.getFighter(0).doubleAttack(battle.getFighter(1));
        battle.notifyObservers(battle.getFighter(0), battle.getFighter(1));
        battle.getFighter(0).setSkill(new RareBerry());
        battle.notifyObservers(battle.getFighter(0));

        System.out.println(battle.getFighter(0).getLastAttack());
        System.out.println(battle.getFighter(1).getLastDefense());
        System.out.println(obs1.getBinnacle());
        System.out.println(obs2.getBinnacle());

    }

    public static void main(String[] args) {
        case01();
    }

}
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

        battle.getFighters().get(0).attack(battle.getFighters().get(1));
        battle.getFighters().set(1, battle.getFighters().get(0).attack(battle.getFighters().get(1)));
        System.out.println("Korby ataco a MeganMan con " + battle.getFighters().get(0).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(1).toString());
        battle.getFighters().get(0).setSkill(new ElexirBottle());
        battle.getFighters().get(0).attack(battle.getFighters().get(1));
        System.out.println("Korby ataco a MeganMan con " + battle.getFighters().get(0).getSkill().getAttackName());
        battle.getFighters().get(0).doubleAttack(battle.getFighters().get(1));
        battle.getFighters().set(1, battle.getFighters().get(0).attack(battle.getFighters().get(1)));
        System.out.println(battle.getFighters().get(1).toString());

    }

    public static void main(String[] args) {
        case01();
    }

}
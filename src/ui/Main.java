package src.ui;

import src.battlefield.Battlefield;
import src.battlefield.Viewer;
import src.specialobjects.ElexirBottle;
import src.specialobjects.RareBerry;
import src.specialobjects.SpecialObject;
import java.util.Random;
import src.utils.WriteFile;

/**
 * Clase Main que inicia con una simulación aleatoria.
 */
public class Main {

    private static Battlefield battle = new Battlefield();
    private static Random ran = new Random();

    public static void case01() {

        Viewer obs1 = new Viewer("mdCess", "Korby");
        Viewer obs2 = new Viewer("Luis", "MeganMan");
        Viewer obs3 = new Viewer("Lupita", "Dittuu");

        battle.addObserver(obs1);
        battle.addObserver(obs2);
        battle.addObserver(obs3);

        attack(0, 1);
        attack(1, 2);
        doubleAttack(2, 1);
        attack(0, 1);
        attack(1, 2);
        doubleAttack(2, 1);
        attack(0, 1);
        attack(1, 2);
        doubleAttack(2, 1);
        attack(0, 1);
        attack(1, 2);
        doubleAttack(2, 1);
        attack(0, 1);
        attack(1, 2);
        doubleAttack(2, 1);
        attack(0, 1);
        attack(1, 2);
        doubleAttack(2, 1);

        attack(1, 2);
        doubleAttack(2, 1);
        attack(0, 1);
        attack(1, 2);
        doubleAttack(2, 1);
        consume(0, new ElexirBottle());
        consume(2, new RareBerry());
        doubleAttack(2, 1);
        attack(0, 1);
        attack(1, 2);
        doubleAttack(2, 1);

        doubleAttack(2, 1);

        attack(0, 1);
        attack(1, 2);
        doubleAttack(2, 1);
        attack(0, 1);
        attack(1, 2);
        doubleAttack(2, 1);
        attack(0, 1);
        attack(1, 2);
        doubleAttack(2, 1);
        attack(0, 1);
        attack(1, 2);
        attack(1, 2);
        doubleAttack(1, 2);

        write(obs1);
        write(obs2);
        write(obs3);
    }

    public static void case02() {

        Viewer obs1 = new Viewer("mdCess", "Korby");
        Viewer obs2 = new Viewer("Luis", "MeganMan");
        Viewer obs3 = new Viewer("Lupita", "Dittu");

        battle.getFighters().get(1).attack(battle.getFighters().get(0));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(0)));
        System.out.println("MemaMan ataco a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(2));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(2)));
        System.out.println("MemaMan ataco a Dittuu con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(2));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(2)));
        System.out.println("MemaMan ataco a Dittuu con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(0));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(0)));
        System.out.println("MemaMan ataco a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(0));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(0)));
        System.out.println("MemaMan ataco a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(2));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(2)));
        System.out.println("MemaMan ataco a Dittuu con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(2));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(2)));
        System.out.println("MemaMan ataco a Dittuu con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(0));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(0)));
        System.out.println("MemaMan ataco a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(2));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(2)));
        System.out.println("MemaMan ataco a Dittuu con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(2));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(2)));
        System.out.println("MemaMan ataco a Dittuu con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(0));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(0)));
        System.out.println("MemaMan ataco a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(0));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(0)));
        System.out.println("MemaMan ataco a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(2));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(2)));
        System.out.println("MemaMan ataco a Dittuu con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(2));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(2)));
        System.out.println("MemaMan ataco a Dittuu con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(0));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(0)));
        System.out.println("MemaMan ataco a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(0));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(0)));
        System.out.println("MemaMan ataco a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(2));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(2)));
        System.out.println("MemaMan ataco a Dittuu con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(2));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(2)));
        System.out.println("MemaMan ataco a Dittuu con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(0));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(0)));
        System.out.println("MemaMan ataco a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(0));
        battle.getFighters().set(1, battle.getFighters().get(1).attack(battle.getFighters().get(0)));
        System.out.println("MemaMan ataco a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());

    }

    public static void case03() {

        Viewer obs1 = new Viewer("mdCess", "Korby");
        Viewer obs2 = new Viewer("Luis", "MeganMan");
        Viewer obs3 = new Viewer("Lupita", "Dittu");

        battle.getFighters().get(0).attack(battle.getFighters().get(1));
        battle.getFighters().set(1, battle.getFighters().get(2).attack(battle.getFighters().get(1)));
        System.out.println("Korby ataco a MeganMan con " + battle.getFighters().get(0).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(1).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(1));
        System.out.println("Korby ataco a MeganMan con " + battle.getFighters().get(0).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(1).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(2));
        battle.getFighters().set(1, battle.getFighters().get(2).attack(battle.getFighters().get(1)));
        System.out.println("MegaMan ataco a Dittu con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(2).attack(battle.getFighters().get(0));
        battle.getFighters().set(2, battle.getFighters().get(0).attack(battle.getFighters().get(1)));
        System.out.println("Dittuu le dio a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());
        battle.getFighters().get(0).setSkill(new ElexirBottle());
        battle.getFighters().get(0).attack(battle.getFighters().get(1));
        System.out.println("Korby ataco a MegaMan con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(1).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(2));
        System.out.println("Korby ataco a Dittu con " + battle.getFighters().get(2).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(1));
        System.out.println("Korby ataco a MeganMan con " + battle.getFighters().get(0).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(1).toString());
        battle.getFighters().get(2).attack(battle.getFighters().get(0));
        battle.getFighters().set(2, battle.getFighters().get(0).attack(battle.getFighters().get(1)));
        System.out.println("Dittuu le dio a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(1));
        System.out.println("Korby ataco a MeganMan con " + battle.getFighters().get(0).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(1).toString());
        battle.getFighters().get(1).attack(battle.getFighters().get(2));
        battle.getFighters().set(1, battle.getFighters().get(2).attack(battle.getFighters().get(1)));
        System.out.println("MegaMan ataco a Dittu con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(0).setSkill(new ElexirBottle());
        battle.getFighters().get(0).attack(battle.getFighters().get(1));
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(2));
        System.out.println("Korby ataco a Dittu con " + battle.getFighters().get(2).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(2));
        System.out.println("Korby ataco a Dittu con " + battle.getFighters().get(2).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(2).attack(battle.getFighters().get(0));
        battle.getFighters().set(2, battle.getFighters().get(0).attack(battle.getFighters().get(1)));
        System.out.println("Dittuu le dio a Korby con " + battle.getFighters().get(1).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(0).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(2));
        System.out.println("Korby ataco a Dittu con " + battle.getFighters().get(2).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(2));
        System.out.println("Korby ataco a Dittu con " + battle.getFighters().get(2).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(1));
        System.out.println("Korby ataco a MeganMan con " + battle.getFighters().get(0).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(1).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(2));
        System.out.println("Korby ataco a Dittu con " + battle.getFighters().get(2).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(1));
        System.out.println("Korby ataco a MeganMan con " + battle.getFighters().get(0).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(1).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(1));
        System.out.println("Korby ataco a MeganMan con " + battle.getFighters().get(0).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(1).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(1));
        System.out.println("Korby ataco a MeganMan con " + battle.getFighters().get(0).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(1).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(2));
        System.out.println("Korby ataco a Dittu con " + battle.getFighters().get(2).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(2));
        System.out.println("Korby ataco a Dittu con " + battle.getFighters().get(2).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(2).toString());
        System.out.println("Korby ataco a MeganMan con " + battle.getFighters().get(0).getSkill().getAttackName());
        System.out.println(battle.getFighters().get(1).toString());
        battle.getFighters().get(0).setSkill(new RareBerry());
        battle.getFighters().get(0).attack(battle.getFighters().get(2));
    }

    private static void attack(int i, int o) {
        if (i > battle.getFighters().size() || o > battle.getFighters().size())
            return;
        battle.getFighter(i).attack(battle.getFighter(o));
        battle.notifyObservers(battle.getFighter(i), battle.getFighter(o));
    }

    private static void doubleAttack(int i, int o) {
        if (i > battle.getFighters().size() || o > battle.getFighters().size())
            return;
        battle.notifyObservers(battle.getFighter(i), battle.getFighter(o));
    }

    private static void consume(int i, SpecialObject specialObject) {
        if (i > battle.getFighters().size())
            ;
        battle.getFighter(i).setSkill(new RareBerry());
        battle.notifyObservers(battle.getFighter(i));
    }

    private static void write(Viewer viewer) {
        WriteFile write = new WriteFile();
        write.writeFile(viewer.getId(), viewer.getBinnacle());
    }

    public static void main(String[] args) {
        int i = ran.nextInt(2);
        switch (i) {
            case 0:
                case01();// El caso uno genera bitacoras
                break;

            case 1:
                case02();
            case 2:
                case03();

        }
    }

}
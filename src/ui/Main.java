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
                case01();
                break;

            case 1:

        }
    }

}
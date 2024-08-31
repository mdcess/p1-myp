package src.battlefield;

public class Viewer implements Observer {

    private String id;
    private String support;
    private String binnacle;

    public Viewer(String id, String support) {
        this.id = id;
        this.support = support;
        this.binnacle = id + "\nElegiste al personaje " + support + "\n";
    }

    public void update(String battle) {
        this.binnacle = binnacle + battle;
    }

    public String getId() {
        return id;
    }

    public String getSupport() {
        return support;
    }

    public String getBinnacle() {
        return this.binnacle;
    }

    @Override
    public String toString() {
        return "";
    }
}
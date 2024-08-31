package src.battlefield;

public class Viewer implements Observer {

    private String id;
    private String support;

    public Viewer(String id, String support) {
        this.id = id;
        this.support = support;
    }

    public void update(String battle) {
    }

    public String getId() {
        return id;
    }

    public String getSupport() {
        return support;
    }

    @Override
    public String toString() {
        return "";
    }
}
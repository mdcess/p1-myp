package src.battlefield;

public class Viewer implements Observer {

    private String id;
    private String support;

    public Viewer(String id, String support) {
        this.id = id;
        this.support = support;
    }

    public String getId() {
        return id;
    }

    public String getSupport() {
        return support;
    }

    public void update() {
    }

    @Override
    public String toString() {
        return "";
    }
}
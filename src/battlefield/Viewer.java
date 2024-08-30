package src.battlefield;

public class Viewer implements Observer{
    
    private String id;
    private Character support;
    private String binnacle;

    public Viewer(String id, Character support){
        this.id=id;
        this.support=support;
    }

    public String getId() {
        return this.id;
    }

    public Character getSupport() {
        return this.support;
    }
    
    public void update(String e){
        this.binnacle = this.binnacle + e; 
    }

}

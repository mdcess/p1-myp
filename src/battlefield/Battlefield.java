package src.battlefield;

import java.util.LinkedList;

public class Battlefield implements Subject {

    /*
     * dos listas ligadas como estructura de datos para meter a los espectadores
     * y a los peleadores
     */
    private LinkedList<Viewer> viewers = new LinkedList<>(); 
    private LinkedList<Character> fighters = new LinkedList<>(); 


    //getters

    public LinkedList<Viewer> getViewers(){
        return this.viewers;
    }

    public LinkedList<Character> getfighters(){
        return this.fighters;
    }
    /*
     * metodo para agregar a un espectador a la lista de espectadores
     */
    public void addViewer(Viewer viewer){
        this.viewers.add(viewer);
    }

    @Override
    public void notify(String s){
        return sfafsa;
    }
}

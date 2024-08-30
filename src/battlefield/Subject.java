package src.battlefield;

public interface Subject {
    void addObserver(Viewer viewer);
    void removeObserver(Viewer viewer);
    void notifyObservers();
}
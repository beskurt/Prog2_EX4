package at.ac.fhcampuswien.fhmdb.controllers;

public interface Observable {
    void addObserver(Observer observer);
    void notifyObservers(String film);
    boolean hasObserver(Observer observer);
}

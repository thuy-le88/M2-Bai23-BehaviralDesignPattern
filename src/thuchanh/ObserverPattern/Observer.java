package thuchanh.ObserverPattern;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

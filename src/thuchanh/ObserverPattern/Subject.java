package thuchanh.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers=new ArrayList<>();
    private int state;

    public void add(Observer o) {
        observers.add(o);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state=state;
    }

    public void execute() {
        for (Observer observer:observers) {
            observer.update();
        }
    }
}

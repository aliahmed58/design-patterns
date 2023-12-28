package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private Observer state;
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void setSate(Observer observer) {
        this.state = observer;
        for (Observer obs : observers) {
            obs.update();
        }
    }

    public Observer getState() {
        return state;
    }

}

import java.util.ArrayList;
import java.util.List;

class Observable {

    private List<Observer> observers = new ArrayList<>();
    private int value;

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.value);
        }
    }
}

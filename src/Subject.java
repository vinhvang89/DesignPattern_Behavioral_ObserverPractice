import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void setState(int state) {
        this.state = state;
    }

    public List<Observer> getObservers() {
        return observers;
    }
    public void execute(){
        for(Observer observer:observers){
            observer.update();
        }
    }

    public int getState() {
        return state;
    }
}

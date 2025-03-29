package Design_Patterns_And_Priciples.observer.bitcoin_tracker;


import java.util.ArrayList;
import java.util.List;

// Observable is the subject class which is being observed by the observers
public abstract class Observable {
    List<Observer> observer=new ArrayList<>();

    public void addObserver(Observer observer){
        this.observer.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observer.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer:this.observer){
            observer.notifyChange();
        }
    }
}

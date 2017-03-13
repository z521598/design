package baidu.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/13.
 */
public abstract class Subject {
    protected List<Observer> list = new ArrayList<>();

    public void registerObserver(Observer observer){
        list.add(observer);
    }
    public void removerObserver(Observer observer){
        list.remove(observer);
    }

    public void notifyAllObs(){
        for(Observer observer : list){
            observer.update(this);
        }
    }

}

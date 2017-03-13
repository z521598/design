package baidu.observer.nativeObs;

import baidu.observer.Subject;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/3/13.
 */
public class ObserverA implements Observer {
    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject)o).getState();
        System.out.println(myState);
    }
}

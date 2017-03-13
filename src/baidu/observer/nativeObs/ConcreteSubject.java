package baidu.observer.nativeObs;

import java.util.Observable;

/**
 * Created by Administrator on 2017/3/13.
 */
public class ConcreteSubject extends Observable{
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 表示已经做了修改
        setChanged();
        // 通知
        notifyObservers();
    }
}

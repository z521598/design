package baidu.observer;

/**
 * Created by Administrator on 2017/3/13.
 */
public class ConcreteSubject extends Subject{
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 发生改变的时候，通知所有观察者
        notifyAllObs();
    }
}

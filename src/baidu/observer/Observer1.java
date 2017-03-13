package baidu.observer;

/**
 * Created by Administrator on 2017/3/13.
 */
public class Observer1 implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println(((ConcreteSubject)subject).getState());
    }
}

package baidu.observer.nativeObs;

/**
 * Created by Administrator on 2017/3/13.
 */
public class DemoClient {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.addObserver(new ObserverA());
        concreteSubject.addObserver(new ObserverA());
        concreteSubject.addObserver(new ObserverA());

        concreteSubject.setState(2);
    }
}

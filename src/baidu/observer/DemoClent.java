package baidu.observer;

/**
 * Created by Administrator on 2017/3/13.
 */
public class DemoClent {
    public static void main(String[] args) {
        // 创建目标对象
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer1 obs1 = new Observer1();
        Observer1 obs2 = new Observer1();
        Observer1 obs3 = new Observer1();
        concreteSubject.registerObserver(obs1);
        concreteSubject.registerObserver(obs2);
        concreteSubject.registerObserver(obs3);
        concreteSubject.setState(2);
    }
}

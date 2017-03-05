package baidu.iterator;

/**
 * Created by langshiquan on 17/3/5.
 */
public class DemoClient {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.addObject("123");
        concreteAggregate.addObject("1234");
        concreteAggregate.addObject("1235");
        concreteAggregate.addObject("1236");
        concreteAggregate.addObject("1237");
        concreteAggregate.addObject("1238");
        MIterator mIterator = concreteAggregate.getIterator();
        while (mIterator.hasNext()) {
            String str = (String) mIterator.getCurrentObj();
            System.out.println(str);
            mIterator.next();
        }
    }
}

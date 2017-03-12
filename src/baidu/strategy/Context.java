package baidu.strategy;

/**
 * Created by langshiquan on 17/3/12.
 */
public class Context {
    private Strategy strategy;

    // 可以通过构造器传值，或者set()

    public Context setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public void printPrice(double price) {
        System.out.println(strategy.getPrice(price));
    }
}

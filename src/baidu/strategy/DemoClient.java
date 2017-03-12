package baidu.strategy;

/**
 * Created by langshiquan on 17/3/12.
 */
public class DemoClient {
    public static void main(String[] args) {
        new Context().setStrategy(new FirstStrategy()).printPrice(9000);
    }
}

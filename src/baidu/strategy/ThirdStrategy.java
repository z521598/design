package baidu.strategy;

/**
 * Created by langshiquan on 17/3/12.
 */
public class ThirdStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        return price * 0.7;
    }
}

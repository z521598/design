package baidu.strategy;

/**
 * Created by langshiquan on 17/3/12.
 */
public class NoStrategyTest {
    public static void main(String[] args) {

        double standrand = 100.9;
        String startegy = "零点九";
        System.out.println(new NoStrategyTest().getPrice(standrand, startegy));
    }

    public double getPrice(double standrand, String strategy) {
        //1. if-else-if-else
        //2. switch java8
        switch (strategy) {
            case "零点五":
                return standrand * 0.5;
            case "零点九":
                return standrand * 0.9;
            default:
                return standrand;
        }
    }
}

package baidu.factory.method;

/**
 * Created by langshiquan on 17/2/26.
 */
public class DemoClient {
    public static void main(String[] args) {
        fmCar audi = new AudiFactory().createCar();
        fmCar byd = new BydFactory().createCar();
        audi.run();
        byd.run();
    }
}

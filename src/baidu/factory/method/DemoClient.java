package baidu.factory.method;

/**
 * Created by langshiquan on 17/2/26.
 */
public class DemoClient {
    public static void main(String[] args) {
        Car audi = new AudiFactory().createCar();
        Car byd = new BydFactory().createCar();
        audi.run();
        byd.run();
    }
}

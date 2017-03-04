package baidu.factory.simple;

/**
 * Created by langshiquan on 17/2/26.
 */
public class DemoClient extends CarFactory {
    public static void main(String []args){
        fsCar audi = CarFactory.createCar("audi");
        fsCar byd = CarFactory.createCar("byd");
        audi.run();
        byd.run();

        fsCar audi2 = CarFactory2.createAudi();
        fsCar byd2 = CarFactory2.createByd();
        audi2.run();
        byd2.run();
    }
}

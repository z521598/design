package baidu.factory.simple;

/**
 * Created by langshiquan on 17/2/26.
 */
public class DemoClient extends CarFactory {
    public static void main(String []args){
        Car audi = CarFactory.createCar("audi");
        Car byd = CarFactory.createCar("byd");
        audi.run();
        byd.run();

        Car audi2 = CarFactory2.createAudi();
        Car byd2 = CarFactory2.createByd();
        audi2.run();
        byd2.run();
    }
}

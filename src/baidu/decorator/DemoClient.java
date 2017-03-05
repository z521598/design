package baidu.decorator;

/**
 * Created by langshiquan on 17/3/4.
 */
public class DemoClient {
    public static void main(String [] args){
        Car car = new Car();
        car.move();
        System.out.println("-------");

        FlyCar flyCar = new FlyCar(car);

        flyCar.move();
        System.out.println("-------");
        AICar aiCar = new AICar(car);

        aiCar.move();
        System.out.println("-------");
        AICar aiCar2 = new AICar(new FlyCar(new Car()));

        aiCar2.move();
    }
}

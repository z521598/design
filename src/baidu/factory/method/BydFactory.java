package baidu.factory.method;

/**
 * Created by langshiquan on 17/2/26.
 */
public class BydFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Byd();
    }
}

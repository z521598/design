package baidu.factory.method;

/**
 * Created by langshiquan on 17/2/26.
 */
public class AudiFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Audi();
    }
}

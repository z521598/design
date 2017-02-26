package baidu.factory.abst;

/**
 * Created by langshiquan on 17/2/26.
 */
public class LowFactory implements CarFactory {
    @Override
    public Enigine createEnigine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}

package baidu.factory.abst;

/**
 * Created by langshiquan on 17/2/26.
 */
public class LuxuryFactory implements CarFactory{
    @Override
    public Enigine createEnigine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}

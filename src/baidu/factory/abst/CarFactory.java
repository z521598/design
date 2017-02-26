package baidu.factory.abst;

/**
 * Created by langshiquan on 17/2/26.
 */
public interface CarFactory {
    Enigine createEnigine();
    Seat createSeat();
    Tyre createTyre();
}

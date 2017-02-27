package baidu.factory.abst;

/**
 * Created by langshiquan on 17/2/26.
 */
public interface Seat {
    void face();
}

class LuxurySeat implements Seat{

    @Override
    public void face() {
        System.out.println("soft");
    }
}

class LowSeat implements Seat{

    @Override
    public void face() {
        System.out.println("hard");
    }
}

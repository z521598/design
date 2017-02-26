package baidu.factory.abst;

/**
 * Created by langshiquan on 17/2/26.
 */
public interface Tyre {
    void run();
}


class LuxuryTyre implements Tyre{

    @Override
    public void run() {
        System.out.println("run faster");
    }
}

class LowTyre implements Tyre{

    @Override
    public void run() {
        System.out.println("run low");
    }
}

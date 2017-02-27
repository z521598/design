package baidu.factory.abst;

/**
 * Created by langshiquan on 17/2/26.
 */
public interface Enigine {
    void run();
    void start();
}

class LuxuryEngine implements Enigine{

    @Override
    public void run() {
        System.out.println("run faster");
    }

    @Override
    public void start() {
        System.out.println("start faster");
    }
}



class LowEngine implements Enigine{

    @Override
    public void run() {
        System.out.println("run low");
    }

    @Override
    public void start() {
        System.out.println("start low");
    }
}

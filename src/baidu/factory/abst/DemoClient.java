package baidu.factory.abst;

/**
 * Created by langshiquan on 17/2/26.
 */
public class DemoClient {
    public static void main(String []args){
        LuxuryFactory luxuryFactory = new LuxuryFactory();
        Enigine enigine = luxuryFactory.createEnigine();
        enigine.run();
        enigine.start();
    }
}

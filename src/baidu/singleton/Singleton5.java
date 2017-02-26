package baidu.singleton;

/**
 * Created by Administrator on 2017/2/19.
 */
public class Singleton5 {
    private static Singleton5 singleton5;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (singleton5 == null) {
            Singleton5 tempSinglton5;
            synchronized (Singleton5.class) {
                tempSinglton5 = singleton5;
                if (tempSinglton5 == null) {
                    synchronized (Singleton5.class) {
                        if (tempSinglton5 == null) {
                            tempSinglton5 = new Singleton5();
                        }
                    }
                }
                singleton5 = tempSinglton5;
            }
        }
        return singleton5;
    }
}

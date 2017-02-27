package baidu.factory.simple;

/**
 * Created by langshiquan on 17/2/26.
 */
public class CarFactory2 {
    public static Car createAudi(){
        return new Audi();
    }
    public static Car createByd(){
        return new Byd();
    }
}

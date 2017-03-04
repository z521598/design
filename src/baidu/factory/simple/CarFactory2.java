package baidu.factory.simple;

/**
 * Created by langshiquan on 17/2/26.
 */
public class CarFactory2 {
    public static fsCar createAudi(){
        return new Audi();
    }
    public static fsCar createByd(){
        return new Byd();
    }
}

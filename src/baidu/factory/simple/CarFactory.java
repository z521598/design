package baidu.factory.simple;

/**
 * Created by langshiquan on 17/2/26.
 */
public class CarFactory {
    public static fsCar createCar(String carType) {
        // 忽略大小写
        if ("Audi".equalsIgnoreCase(carType)) {
            return new Audi();
        } else if ("Byd".equalsIgnoreCase(carType)) {
            return new Byd();
        } else {
            return null;
        }
    }

    public static fsCar createCar2(String carType) {
        switch (carType) {
            case "audi":
                return new Audi();
            case "byd":
                return new Byd();
            default:
                return null;
        }
    }
}


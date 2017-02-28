package baidu.prototype.clone;

import java.util.Date;

/**
 * Created by langshiquan on 17/2/28.
 */
public class DemoClient2 {
    public static void main(String[] args) throws Exception {

        Date date = new Date();
        Sheep2 s1 = new Sheep2("多利", date);
        Sheep2 sheep = (Sheep2) s1.clone();
        System.out.println(s1);
        System.out.println(sheep);

        date.setDate(30);

        System.out.println(s1);
        System.out.println(sheep);


    }
}

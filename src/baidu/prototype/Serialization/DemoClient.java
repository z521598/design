package baidu.prototype.Serialization;

import java.util.Date;

/**
 * Created by langshiquan on 17/2/28.
 */
public class DemoClient {
    public static void main(String[] args) throws Exception {

        Date date = new Date();
        Sheep s1 = new Sheep("多利", date);
        Sheep sheep = (Sheep) s1.clone();
        System.out.println(s1);
        System.out.println(sheep);



        date.setDate(30);

        System.out.println(s1);
        System.out.println(sheep);


    }
}

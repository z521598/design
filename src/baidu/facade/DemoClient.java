package baidu.facade;

/**
 * Created by langshiquan on 17/3/4.
 */
public class DemoClient {
    public static void main(String[] rags) {
        // 之前
        for (int i = 0; i <= 4; i++) {
            new 各种局("局" + i).register();
        }
        System.out.println("---------");
        // 之后
        new RegisterFacade().register();

    }
}

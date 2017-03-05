package baidu.facade;

/**
 * Created by langshiquan on 17/3/4.
 */
public class RegisterFacade {
    public void register() {
        for (int i = 0; i <= 4; i++) {
            new 各种局("局" + i).register();
        }

    }
}

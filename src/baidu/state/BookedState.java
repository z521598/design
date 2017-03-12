package baidu.state;

/**
 * Created by langshiquan on 17/3/12.
 */
public class BookedState implements State {
    @Override
    public void hanle() {
        System.out.println("已预定");
    }
}

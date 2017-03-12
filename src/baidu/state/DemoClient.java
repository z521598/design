package baidu.state;

/**
 * Created by langshiquan on 17/3/12.
 */
public class DemoClient {
    public static void main(String[] args) {
        RoomContext context = new RoomContext();
        context.setState(new FreeState());
    }
}

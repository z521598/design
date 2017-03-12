package baidu.state;

/**
 * Created by langshiquan on 17/3/12.
 */
public class RoomContext {
    private State state;

    public void setState(State state) {
        this.state = state;
        state.hanle();  // 处理
    }
}

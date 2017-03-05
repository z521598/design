package baidu.ChainOfRespon;

/**
 * Created by langshiquan on 17/3/5.
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    // 处理请求的核心业务方法
    abstract void handleRequest(LeaveRequest request);
}

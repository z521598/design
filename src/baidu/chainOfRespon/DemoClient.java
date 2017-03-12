package baidu.chainOfRespon;

/**
 * Created by langshiquan on 17/3/5.
 */
public class DemoClient {
    public static void main(String[] args) {
        // 责任关系用例准备
        Leader leader1 = new Director("张三");
        Leader leader2 = new Manager("李四");
        Leader leader3 = new GeneralManager("王五");
        leader1.setNextLeader(leader2);
        leader2.setNextLeader(leader3);

        // 开始请假
        LeaveRequest leaveRequest = new LeaveRequest("我",9,"回家");
        leader1.handleRequest(leaveRequest);

    }
}

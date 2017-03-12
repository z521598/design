package baidu.chainOfRespon;

/**
 * Created by langshiquan on 17/3/5.
 */
//主任
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    void handleRequest(LeaveRequest request) {
        if (request.getDay() < 10 && request.getDay() >= 3) {
            System.out.println("员工：" + request.getName() + ",请假天数：" +
                            request.getDay() + ",理由：" + request.getReason());
            System.out.println(this.name + "已审批");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}

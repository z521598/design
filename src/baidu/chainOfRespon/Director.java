package baidu.chainOfRespon;

/**
 * Created by langshiquan on 17/3/5.
 */
//主任
public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    void handleRequest(LeaveRequest request) {
        if (request.getDay() < 3) {
            System.out.println(
                    "员工：" + request.getName() + ",请假天数：" +
                            request.getDay() + ",理由：" + request.getReason() + "," + this.name + "已审批");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}

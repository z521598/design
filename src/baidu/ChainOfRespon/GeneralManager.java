package baidu.ChainOfRespon;

/**
 * Created by langshiquan on 17/3/5.
 */
//主任
public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    void handleRequest(LeaveRequest request) {
        if (request.getDay() >= 10 && request.getDay() <= 30) {
            System.out.println(
                    "员工：" + request.getName() + ",请假天数：" +
                            request.getDay() + ",理由：" + request.getReason() + "," + this.name + "已审批");
        } else {
            System.out.println("要辞职？请那么多天假？！");
        }
    }
}

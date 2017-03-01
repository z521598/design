package baidu.adapter;

/**
 * Created by Administrator on 2017/3/1.
 */
// 目标客户端
public class Targetclient {
    public void test(Target t){
        t.handleTarget();
    }

    public static void main(String []args){
        Targetclient targetclient = new Targetclient();
        Adaptee adaptee = new Adaptee();

        Target target = new Adapter();
        Target target2 = new Adapter2();
        targetclient.test(target);
        targetclient.test(target2);


    }
}

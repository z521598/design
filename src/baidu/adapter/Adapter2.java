package baidu.adapter;

/**
 * Created by Administrator on 2017/3/1.
 */
// 对象适配器 通过组合的方式
public class Adapter2 implements Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void handleTarget() {
        adaptee.request();
    }
}

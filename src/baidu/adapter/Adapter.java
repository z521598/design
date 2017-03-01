package baidu.adapter;

/**
 * Created by Administrator on 2017/3/1.
 */
// 类适配器方式 继承的方式
public class Adapter extends Adaptee implements Target{

    @Override
    public void handleTarget() {
        super.request();
    }
}

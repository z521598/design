package baidu.singleton;

/**
 * Created by Administrator on 2017/2/18.
 */
// 懒汉式
public class Singleton2 {
    // 类初始化的时候，不初始化这个对象，延时加载
    private static Singleton2 singleton2;
    private Singleton2(){
    }
    // 方法同步，调用效率低
    public static synchronized Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}

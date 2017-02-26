package baidu.singleton;

/**
 * Created by Administrator on 2017/2/18.
 */
public enum  Singleton4 {
    // 枚举元素，本身就是一个单例，避免了反射和发序列化的漏洞
    INSTANCE;
    // 不能延时加载
    public void SingletonOperations(){
        // 需要的功能处理
    }
}

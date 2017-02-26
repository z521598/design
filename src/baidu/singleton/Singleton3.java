package baidu.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/18.
 */
// 静态内部类式,最好的单例模式
public class Singleton3 implements Serializable{

    // 类初始化的时候，不初始化静态内部类，延时加载
    private static class SingleInstance{
        // 线程安全
        private static final Singleton3 instance = new Singleton3();
    }
    private Singleton3(){}

    public static Singleton3 getInstance(){
        return SingleInstance.instance;
    }
    private Object readResolve() throws ObjectStreamException {
        return SingleInstance.instance;
    }

}


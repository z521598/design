package baidu.singleton;


import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/18.
 */
// 饿汉式
public class Singleton1 implements Serializable {

    // 类加载机制-双亲委派模型，保证了线程安全
    private static final Singleton1 singleton1 = new Singleton1();
    // 私有构造器
    private Singleton1(){
        // 防止反射破坏单例模式
//        if(singleton1 !=null){
//            throw new RuntimeException();
//        }
    }
    // 方法没有同步synchronized，调用效率高
    public  static Singleton1 getInstance(){
        return singleton1;
    }

    // 防止反序列化破坏单例,反序列化的时候，直接返回此方法指定的对象，而不是单独新建一个新对象
    private Object readResolve() throws ObjectStreamException{
        return singleton1;
    }
}

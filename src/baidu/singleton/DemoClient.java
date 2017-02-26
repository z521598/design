package baidu.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * Created by Administrator on 2017/2/18.
 */
public class DemoClient {
    public static void main(String [] args) throws Exception {

        Singleton1 singleton11 = Singleton1.getInstance();
        Singleton1 singleton12 = Singleton1.getInstance();
        // 打印 类名+哈希编码
        System.out.println(singleton11);
        System.out.println(singleton12);


        // 通过反射来破解懒汉式单例
        Class<Singleton1> singleton1Class = (Class<Singleton1>) Class.forName("com.baidu.singleton.Singleton1");
        // getDeclaredConstructor与getConstructor区别在于，前者能够获取到非public的构造器
        Constructor<Singleton1> classConstructor = singleton1Class.getDeclaredConstructor(null);
        // 设置此方法可以进入，（提高了类的访问速度）
        classConstructor.setAccessible(true);
        Singleton1 singleton13 = classConstructor.newInstance();
        System.out.println(singleton13);


        // 序列化
        FileOutputStream fileOutputStream = new FileOutputStream("D:/a.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(singleton11);
        objectOutputStream.close();
        fileOutputStream.close();

        // 反序列化
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:/a.txt"));
        Singleton1 singleton14 = (Singleton1) objectInputStream.readObject();
        System.out.println(singleton14);
        objectInputStream.close();


        Singleton5 singleton51 = Singleton5.getInstance();
        Singleton5 singleton52 = Singleton5.getInstance();
        // 打印 类名+哈希编码
        System.out.println(singleton51);
        System.out.println(singleton52);






    }
}

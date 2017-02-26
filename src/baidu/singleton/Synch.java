package baidu.singleton;

/**
 * Created by Administrator on 2017/2/19.
 */
public class Synch {

    private Synch synch;
    //无论synchronized关键字加在方法上还是对象上，如果它作用的对象是非静态的，则它取得的锁是对象；如果synchronized作用的对象是一个静态方法或一个类，则它取得的锁是对类，该类所有的对象同一把锁。

    public void dosomeThing() {
        // 一个线程访问一个对象中的synchronized(this)同步代码块时，其他试图访问该对象的线程将被阻塞
        synchronized (this) {

        }
    }

    private Synch() {
    }

    // synchronized修饰方法和修饰一个代码块类似，只是作用范围不一样，修饰代码块是大括号括起来的范围，而修饰方法范围是整个函数
    public synchronized void doThing2() {

    }

    public synchronized static void doThing3() {

    }

    public static void doThing4() {
        synchronized (Synch.class) {

        }
    }

}

package baidu.proxy.dynamicProxy;


import java.lang.reflect.Proxy;


/**
 * Created by Administrator on 2017/3/2.
 */
public class DemoClient {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler starHandler = new StarHandler(realStar);

        // 返回的对象代理了原先的RealStar
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class},starHandler);
        proxy.sing();

        proxy.getMoney();
    }
}

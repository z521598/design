package baidu.proxy.staticProxy;

/**
 * Created by Administrator on 2017/3/2.
 */
public class DemoClient {
    public static void main(String []args){
        Star realStar = new RealStar();
        Star proxyPerson = new ProxyPerson(realStar);
        proxyPerson.confer();
        proxyPerson.bookTicket();
        proxyPerson.signContract();
        proxyPerson.sing();
        proxyPerson.getMoney();

    }
}

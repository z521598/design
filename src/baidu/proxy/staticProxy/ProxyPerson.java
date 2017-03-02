package baidu.proxy.staticProxy;

/**
 * Created by Administrator on 2017/3/2.
 */
public class ProxyPerson implements Star{

    private Star star;

    public ProxyPerson(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("Proxy Person confer");
    }

    @Override
    public void signContract() {
        System.out.println("Proxy Person sign contract");
    }

    @Override
    public void bookTicket() {
        System.out.println("Proxy Person book ticket");
    }

    @Override
    public void sing() {
       star.sing();
    }

    @Override
    public void getMoney() {
        System.out.println("Proxy Person get money");
    }
}

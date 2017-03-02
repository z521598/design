package baidu.proxy.staticProxy;

/**
 * Created by Administrator on 2017/3/2.
 */
public class RealStar implements Star{
    @Override
    public void confer() {
        System.out.println("Real Star confer");

    }

    @Override
    public void signContract() {
        System.out.println("Real Star sign contract");
    }

    @Override
    public void bookTicket() {
        System.out.println("Real Star book ticket");
    }

    @Override
    public void sing() {
        System.out.println("Real Star sing");
    }

    @Override
    public void getMoney() {
        System.out.println("Real Star get money");
    }
}

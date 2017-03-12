package baidu.mediator;

/**
 * Created by Administrator on 2017/3/6.
 */
public class DemoClient {
    public static void main(String []args){
        Mediator mediator = new ET();

        ICafe iCafe = new ICafe(mediator);
        ICode iCode = new ICode(mediator);
        Agile agile = new Agile(mediator);

        iCafe.selfAction();
        iCafe.outAction();
    }
}

package baidu.memento;

/**
 * Created by langshiquan on 17/3/12.
 */
public class DemoClient {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator("张三", 18, 2000.0);
        // 第一次打印
        System.out.println(originator);
        careTaker.setMenento(originator.menento());
        originator.setName("李四");
        originator.setSalary(1000.0);
        // 第二次打印
        System.out.println(originator);
        // 恢复
        originator.recovert(careTaker.getMenento());
        System.out.println(originator);
    }
}

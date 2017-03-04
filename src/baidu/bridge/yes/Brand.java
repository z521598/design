package baidu.bridge.yes;

/**
 * Created by langshiquan on 17/3/4.
 */
// 电脑品牌
public interface Brand {
    void sale();
}

class Lenovo implements Brand{

    @Override
    public void sale() {
        System.out.println("联想");
    }
}

class Dell implements Brand{

    @Override
    public void sale() {
        System.out.println("戴尔");
    }
}

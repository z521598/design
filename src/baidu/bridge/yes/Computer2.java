package baidu.bridge.yes;

/**
 * Created by langshiquan on 17/3/4.
 */
// 电脑类型
public class Computer2 {

    protected Brand brand;

    public Computer2(Brand brand) {
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }
}

class Destop extends Computer2{

    public Destop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("台式机");
    }
}

class Laptop extends Computer2{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("笔记本");
    }
}


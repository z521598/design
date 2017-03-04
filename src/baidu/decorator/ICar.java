package baidu.decorator;

/**
 * Created by langshiquan on 17/3/4.
 */
// 抽象对象
public interface ICar{
    void move();
}

// 具体构件对象(真实对象，被装饰的对象)
class Car implements  ICar{

    @Override
    public void move() {
        System.out.println("在陆地上跑");
    }
}
// 装饰器角色
class SuperCar implements ICar{

    protected ICar car;

    public SuperCar(ICar car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
// 具体装饰对象
class FlyCar extends SuperCar{

    public FlyCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        fly();
    }

    public void fly(){
        System.out.println("天上飞");
    }
}


// 具体装饰对象
class AICar extends SuperCar{

    public AICar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        auto();
    }

    public void auto(){
        System.out.println("自动跑");
    }
}

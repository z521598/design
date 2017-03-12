package baidu.mediator;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Agile implements Department{

    // 持有中介者的引用
    private Mediator mediator;
    @Override
    public void selfAction() {
        System.out.println("pipeline");
    }


    public Agile(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("agile",this);
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作");
    }
}

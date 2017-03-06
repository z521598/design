package baidu.Mediator;

/**
 * Created by Administrator on 2017/3/6.
 */
public class ICafe implements Department{

    // 持有中介者的引用
    private Mediator mediator;
    @Override
    public void selfAction() {
        System.out.println("卡片，管理需求");
    }


    public ICafe(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("icafe",this);
    }

    @Override
    public void outAction() {
        // 业务逻辑
        System.out.println("汇报工作");
        mediator.command("icode");
    }
}

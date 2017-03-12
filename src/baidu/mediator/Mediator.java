package baidu.mediator;

/**
 * Created by Administrator on 2017/3/6.
 */
public interface Mediator {
    void register(String dname,Department department);
    void command(String dname);

}

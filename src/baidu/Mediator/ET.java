package baidu.Mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/6.
 */
public class ET implements Mediator{
    Map<String,Department> map = new HashMap<>();
    @Override
    public void register(String dname, Department department) {
        map.put(dname,department);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }
}

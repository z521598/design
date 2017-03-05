package baidu.FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by langshiquan on 17/3/5.
 */
// 享元工厂类
public class ChessFlyweightFactory {
    // 享元池对象
    private static Map<String, ChessFlyweight> map = new HashMap<>();

    public static ChessFlyweight getChess(String color) {
        //判断容器有无,有就返回，没有就创建
        if(map.get(color) != null){
            return map.get(color);

        }else {
            ConcreteChess concreteChess = new ConcreteChess(color);
            map.put(color,concreteChess);
            return concreteChess;
        }

    }
}

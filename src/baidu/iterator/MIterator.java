package baidu.iterator;

/**
 * Created by langshiquan on 17/3/5.
 */
// 自定义的迭代接口
public interface MIterator {
    // 将游标指向第一个
    void first();
    boolean hasNext();
    boolean isFirst();
    boolean isLast();


    // 两者可以合一起
    // 游标下移
    void next();
    // 获取当前游标指向的对象
    Object getCurrentObj();



}

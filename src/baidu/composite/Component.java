package baidu.composite;

/**
 * Created by langshiquan on 17/3/4.
 */
// 抽象组件
public interface Component {
    void operation();
}
//叶子节点
interface Leaf extends Component {

}
//容器组件
interface Composite extends Component {
    void add(Component component);
    void remove(Component component);
    Component getChild(int index);
}
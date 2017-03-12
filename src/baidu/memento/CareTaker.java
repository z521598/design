package baidu.memento;

import java.util.Stack;

/**
 * Created by langshiquan on 17/3/12.
 */
// 负责管理 备忘录对象
public class CareTaker {

    // 只备份一次
    private Menento menento;

    // 可以备份多个
//    private Stack<Menento> stack = new Stack<>();

    public Menento getMenento() {
        return menento;
    }

    public void setMenento(Menento menento) {
        this.menento = menento;
    }



}

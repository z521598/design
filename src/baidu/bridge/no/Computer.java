package baidu.bridge.no;

/**
 * Created by langshiquan on 17/3/3.
 */
// 多层继承问题
// 繁琐
// 一个类由2个能引起类变化的原因，违反单一职责原则
public interface Computer {
    void sale();
}

class Destop implements Computer {

    @Override
    public void sale() {
        System.out.println("台式机");
    }
}

class Laptop implements Computer {

    @Override
    public void sale() {
        System.out.println("笔记本");
    }
}

class Pad implements Computer {

    @Override
    public void sale() {
        System.out.println("平板电脑");
    }
}

class LenovoDestop extends Destop {
    @Override
    public void sale() {
        System.out.println("联想台式机");
    }
}

class LenovoLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("联想笔记本");
    }
}

class LenovoPad extends Pad {
    @Override
    public void sale() {
        System.out.println("联想平板");
    }
}

class HaseeDestop extends Destop {
    @Override
    public void sale() {
        System.out.println("神舟台式机");
    }
}

class HaseeLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("神舟笔记本");
    }
}

class HaseePad extends Pad {
    @Override
    public void sale() {
        System.out.println("神舟平板");
    }
}


class DelliDestop extends Destop {
    @Override
    public void sale() {
        System.out.println("戴尔台式机");
    }
}

class DelliLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("戴尔笔记本");
    }
}

class DelliPad extends Pad {
    @Override
    public void sale() {
        System.out.println("戴尔平板");
    }
}










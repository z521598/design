package baidu.prototype.clone;

import java.util.Date;

/**
 * Created by langshiquan on 17/2/28.
 */
// 标记接口
public class Sheep2 implements Cloneable{
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 深克隆：克隆了所有值以及引用的值。
        Object object = super.clone();  //直接调用Object的clone()方法
        // 加入如下方法，实现深克隆,将属性也进行clone
        Sheep2 s = (Sheep2)object;
        s.birthday = (Date) this.birthday.clone();
        return object;
    }



    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Sheep2(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "sname:"+sname+";birthay:"+birthday.toString();
    }
}

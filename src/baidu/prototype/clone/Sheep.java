package baidu.prototype.clone;

import java.util.Date;

/**
 * Created by langshiquan on 17/2/28.
 */
// 标记接口
public class Sheep implements Cloneable{
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅克隆：克隆了所有值以及引用。
        Object object = super.clone();  //直接调用Object的clone()方法
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

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "sname:"+sname+";birthay:"+birthday.toString();
    }
}

package baidu.memento;

/**
 * Created by langshiquan on 17/3/12.
 */
// 备忘录类
public class Menento {
    private String name;
    private int age;
    private double salary;

    // 运用构造器存储源发器
    public Menento(Originator originator) {

        this.name = originator.getName();
        this.age = originator.getAge();
        this.salary = originator.getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

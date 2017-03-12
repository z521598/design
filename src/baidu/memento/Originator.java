package baidu.memento;

/**
 * Created by langshiquan on 17/3/12.
 */
// 源发器类
public class Originator {
    private String name;
    private int age;
    private double salary;

    // 进行备份操作
    public Menento menento() {
        return new Menento(this);
    }

    // 数据恢复操作

    public void recovert(Menento menento) {

        this.name = menento.getName();
        this.age = menento.getAge();
        this.salary = menento.getSalary();
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

    public Originator(String name, int age, double salary) {

        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name:"+this.name+" age:"+this.age+" salary:"+this.salary;
    }
}

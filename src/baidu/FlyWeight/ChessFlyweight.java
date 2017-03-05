package baidu.FlyWeight;

/**
 * Created by langshiquan on 17/3/5.
 */

public interface ChessFlyweight {

    void setColor(String color);

    String getColor();

    void display(Coordinate coordinate);
}


class ConcreteChess implements ChessFlyweight {
    // 为内部状态提供存储
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("color : " + color + ",coordinate : " + coordinate.getX() + "," + coordinate.getY());
    }
}
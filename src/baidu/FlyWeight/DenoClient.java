package baidu.FlyWeight;

/**
 * Created by langshiquan on 17/3/5.
 */
public class DenoClient {
    public static void main(String [] rags){

        ChessFlyweight chessFlyweight1 = ChessFlyweightFactory.getChess("black");
        ChessFlyweight chessFlyweight2 = ChessFlyweightFactory.getChess("black");
        ChessFlyweight chessFlyweight3 = ChessFlyweightFactory.getChess("black");
        System.out.println(chessFlyweight1+","+chessFlyweight1.getColor());
        System.out.println(chessFlyweight2+","+chessFlyweight1.getColor());
        System.out.println(chessFlyweight3+","+chessFlyweight1.getColor());

        chessFlyweight1.display(new Coordinate(1,2));
        chessFlyweight2.display(new Coordinate(10,2));
        chessFlyweight3.display(new Coordinate(1,22));


    }
}

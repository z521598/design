package baidu.build;

/**
 * Created by Administrator on 2017/2/27.
 */
public class DemoClient {
    public static void main(String []args){
        AirShipDirector airShipDirector = new BaiduAirShipDirector(new BaiduAirShipBuilder());
        AirShip airShip = airShipDirector.directAirShip();
        System.out.println(airShip);
    }
}

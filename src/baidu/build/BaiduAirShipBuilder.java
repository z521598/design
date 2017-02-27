package baidu.build;

/**
 * Created by Administrator on 2017/2/27.
 */
public class BaiduAirShipBuilder implements AirShipBuilder{
    // 此处可以和工厂方法或者单例模式结合
    @Override
    public Engine buildEngine() {
        System.out.println("baidu engine");
        return new Engine("baidu engine");
    }

    @Override
    public OrbitalModule duildOrbitalModule() {
        System.out.println("baidu orbital");
        return new OrbitalModule("baidu orbital");
    }

    @Override
    public EscapeTower duildEscapeTower() {
        System.out.println("baidu escapeTower");
        return new EscapeTower("baidu escapeTower");
    }
}

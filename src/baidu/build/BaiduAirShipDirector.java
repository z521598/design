package baidu.build;

/**
 * Created by Administrator on 2017/2/27.
 */
public class BaiduAirShipDirector implements AirShipDirector{

    private  AirShipBuilder airShipBuilder;

    public BaiduAirShipDirector(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine = airShipBuilder.buildEngine();
        EscapeTower escapeTower = airShipBuilder.duildEscapeTower();
        OrbitalModule orbitalModule = airShipBuilder.duildOrbitalModule();
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}

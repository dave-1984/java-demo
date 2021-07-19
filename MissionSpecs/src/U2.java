
import java.util.Random;
import java.util.ArrayList;

public class U2 extends Rocket {
    //it costs $120 Million to build and weighs 20 tonnes
    public U2() {
        super(18, 29, 120);

    }


    @Override
    public boolean launch() {
        double launch;
        double cargoCarried = 0;
        double success = Math.random();//0-1的數字,低於爆炸率為爆炸，高於爆炸率為成功
        launch = 0.04 * (cargoWight() / (getShipLimit() - getShipWeight()));
        if (success > launch) {
            return true;
        } else return false;
    }

    @Override
    public boolean land() {
        double land;
        double cargoCarried = 0;
        double success = Math.random();//0-1的數字,低於爆炸率為爆炸，高於爆炸率為成功

        land = 0.08 * (cargoWight() / (getShipLimit() - getShipWeight()));
        if (success > land) {
            return true;
        } else return false;
    }
    //cancarry and carry in Rocket
}
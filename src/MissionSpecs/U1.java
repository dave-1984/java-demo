package MissionSpecs;

import java.util.ArrayList;
public  class U1 extends Rocket {

    public U1() {
        super(10, 18, 100);
        // count++;//一開始運行先創造一個之後判斷是否成功，失敗則要創造一個


    }


    @Override
    public boolean launch() {
        double launch;
        double cargoCarried = 0;
        double success = Math.random();//0-1的數字,低於爆炸率為爆炸，高於爆炸率為成功
        launch = 0.05 * (cargoWight() / (getShipLimit() - getShipWeight()));
        if (success >= launch) {
            return true;
        } else return false;
    }

    @Override
    public boolean land() {
        double land;
        double cargoCarried = 0;
        double success = Math.random();//0-1的數字,低於爆炸率為爆炸，高於爆炸率為成功

        land = 0.01 * (cargoWight() / (getShipLimit() - getShipWeight()));
        if (success >= land) {
            return true;
        } else return false;
    }

    //cancarry and carry in Rocket
}

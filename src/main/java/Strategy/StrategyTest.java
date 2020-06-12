package Strategy;

import org.junit.Test;

public class StrategyTest {

    @Test
    public void test(){
        Car flyCar=new FlyCar();
        flyCar.setDriver(new FlyDriver());
        flyCar.drive();

        Car normalCar=new NormalCar();
        normalCar.setDriver(new RunDriver());
        normalCar.drive();

    }
}

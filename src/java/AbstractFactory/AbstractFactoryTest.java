package AbstractFactory;

import AbstractFactory.factory.CarFactory;
import AbstractFactory.factory.FactoryProducer;
import AbstractFactory.product.Engine;
import AbstractFactory.product.Tyre;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void hondaTest() throws Exception {
        CarFactory carFactory = FactoryProducer.factory("Honda");
        Engine engine=carFactory.createEngine();
        Tyre tyre=carFactory.createTyre();
        engine.start();
        tyre.roll();
        engine.stop();
    }

    @Test
    public void toyotaTest() throws Exception {
        CarFactory carFactory = FactoryProducer.factory("Toyota");
        Engine engine=carFactory.createEngine();
        Tyre tyre=carFactory.createTyre();
        engine.start();
        tyre.roll();
        engine.stop();

    }
}

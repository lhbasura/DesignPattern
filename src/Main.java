import AbstractFactory.factory.FactoryProducer;
import AbstractFactory.factory.HondaFactory;
import AbstractFactory.factory.ToyotaFactory;
import AbstractFactory.product.engine.HondaEngine;
import AbstractFactory.product.engine.ToyotaEngine;
import AbstractFactory.product.tyre.HondaTyre;
import AbstractFactory.product.tyre.ToyotaTyre;

public class Main {
    public static void main(String[] args) throws Exception {
        ToyotaFactory toyotaFactory = (ToyotaFactory) FactoryProducer.factory("toyota");
        HondaFactory hondaFactory = (HondaFactory) FactoryProducer.factory("honda");
        ToyotaEngine toyotaEngine = (ToyotaEngine) toyotaFactory.createEngine();
        ToyotaTyre toyotaTyre = (ToyotaTyre) toyotaFactory.createTyre();
        HondaEngine hondaEngine = (HondaEngine) hondaFactory.createEngine();
        HondaTyre hongdaTyre = (HondaTyre) hondaFactory.createTyre();
        toyotaEngine.start();
        toyotaTyre.roll();
        toyotaEngine.stop();

        hondaEngine.start();
        hongdaTyre.roll();
        hondaEngine.stop();
    }
}

package AbstractFactory.factory;

import AbstractFactory.product.Engine;
import AbstractFactory.product.Tyre;
import AbstractFactory.product.engine.ToyotaEngine;
import AbstractFactory.product.tyre.ToyotaTyre;

public class ToyotaFactory implements CarFactory {
    @Override
    public Tyre createTyre() {
        return new ToyotaTyre();
    }

    @Override
    public Engine createEngine() {
        return new ToyotaEngine();
    }
}

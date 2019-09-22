package AbstractFactory.factory;

import AbstractFactory.product.Engine;
import AbstractFactory.product.Tyre;
import AbstractFactory.product.engine.HondaEngine;
import AbstractFactory.product.tyre.HondaTyre;

public class HondaFactory implements CarFactory {
    @Override
    public Tyre createTyre() {
        return new HondaTyre();
    }

    @Override
    public Engine createEngine() {
        return new HondaEngine();
    }
}

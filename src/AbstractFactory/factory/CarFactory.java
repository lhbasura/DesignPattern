package AbstractFactory.factory;

import AbstractFactory.product.Engine;
import AbstractFactory.product.Tyre;

public interface CarFactory {
    public Tyre createTyre();
    public Engine createEngine();

}

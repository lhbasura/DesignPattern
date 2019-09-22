package AbstractFactory.product.engine;

import AbstractFactory.product.Engine;

public class ToyotaEngine extends Engine{
    @Override
    public void start() {
        System.out.println("ToyotaEngine is start");
    }

    @Override
    public void stop() {
        System.out.println("ToyotaEngine is stop");
    }
}

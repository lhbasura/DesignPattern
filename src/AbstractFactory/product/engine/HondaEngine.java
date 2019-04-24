package AbstractFactory.product.engine;

import AbstractFactory.product.Engine;

public class HondaEngine extends Engine{
    @Override
    public void start() {
        System.out.println("HodaEngine is start");
    }

    @Override
    public void stop() {
        System.out.println("HodaEngine is stop");
    }
}

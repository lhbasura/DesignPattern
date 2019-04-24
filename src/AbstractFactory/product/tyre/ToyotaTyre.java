package AbstractFactory.product.tyre;

import AbstractFactory.product.Tyre;

public class ToyotaTyre extends Tyre {
    @Override
    public void roll() {
        System.out.println("ToyotaTyre is rolling");
    }
}

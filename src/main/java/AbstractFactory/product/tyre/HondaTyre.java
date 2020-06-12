package AbstractFactory.product.tyre;

import AbstractFactory.product.Tyre;

public class HondaTyre extends Tyre {
    @Override
    public void roll() {
        System.out.println("HondaTyre is rolling");
    }
}

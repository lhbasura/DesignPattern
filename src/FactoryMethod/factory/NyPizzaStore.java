package FactoryMethod.factory;

import FactoryMethod.product.Pizza;

public class NyPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        return null;
    }
}

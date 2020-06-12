package FactoryMethod.factory;

import FactoryMethod.product.NyCheesePizza;
import FactoryMethod.product.NyVegglePizza;
import FactoryMethod.product.Pizza;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NyPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("Cheese".equals(type)) {
            pizza = new NyCheesePizza();
        }
        if ("Veggle".equals(type)) {
            pizza = new NyVegglePizza();
        }
        return pizza;
    }
}

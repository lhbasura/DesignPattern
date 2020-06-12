package FactoryMethod.factory;

import FactoryMethod.product.Pizza;

import java.lang.reflect.InvocationTargetException;

public abstract class PizzaStore {
    public Pizza orderPizza(String type)
    {
        Pizza pizza;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        return pizza;
    }

    /**
     * 工厂方法模式的核心
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}

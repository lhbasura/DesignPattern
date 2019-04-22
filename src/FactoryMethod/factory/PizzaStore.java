package FactoryMethod.factory;

import FactoryMethod.product.Pizza;

import java.lang.reflect.InvocationTargetException;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
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
    public abstract Pizza createPizza(String type) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}

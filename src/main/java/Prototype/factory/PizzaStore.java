package Prototype.factory;

import Prototype.product.Pizza;

import java.util.HashMap;
import java.util.Map;

public abstract class PizzaStore {

    protected Map<String,Pizza>map=new HashMap<>();
    public abstract void loadCache();
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

package Prototype.factory;

import Prototype.product.NyCheesePizza;
import Prototype.product.NyVegglePizza;
import Prototype.product.Pizza;

public class NyPizzaStore extends PizzaStore {

    @Override
    protected void loadCache() {

    }

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = map.get("Ny"+type);
        if ("Cheese".equals(type)) {
            pizza = new NyCheesePizza();
        }
        if ("Veggle".equals(type)) {
            pizza = new NyVegglePizza();
        }
        return pizza;
    }
}

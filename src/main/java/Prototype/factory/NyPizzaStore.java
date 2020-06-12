package Prototype.factory;

import Prototype.product.NyCheesePizza;
import Prototype.product.NyVegglePizza;
import Prototype.product.Pizza;

public class NyPizzaStore extends PizzaStore {

    public void loadCache() {
        map.put("Cheese",new NyCheesePizza());
        map.put("Veggle",new NyVegglePizza());
    }

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        try {
            pizza = map.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pizza;
    }
}

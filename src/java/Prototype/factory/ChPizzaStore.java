package Prototype.factory;

import Prototype.product.ChCheesePizza;
import Prototype.product.ChVegglePizza;
import Prototype.product.Pizza;

public class ChPizzaStore extends PizzaStore {
    @Override
    public void loadCache() {
        map.put("Cheese",new ChCheesePizza());
        map.put("Veggle",new ChVegglePizza());
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

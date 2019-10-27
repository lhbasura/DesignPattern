package Prototype.factory;

import Prototype.product.ChCheesePizza;
import Prototype.product.ChVegglePizza;
import Prototype.product.Pizza;

public class ChPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("Cheese".equals(type)) {
            pizza = new ChCheesePizza();
        }
        if ("Veggle".equals(type)) {
            pizza = new ChVegglePizza();
        }
        return pizza;
    }
}

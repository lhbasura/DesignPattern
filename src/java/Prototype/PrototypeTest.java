package Prototype;

import Prototype.factory.NyPizzaStore;
import Prototype.factory.PizzaStore;
import Prototype.product.Pizza;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void test() {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        nyPizzaStore.loadCache();
        Pizza nyCheesePizza = nyPizzaStore.orderPizza("Cheese");
        System.out.println(nyCheesePizza);
    }

}

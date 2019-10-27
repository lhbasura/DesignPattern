package Prototype;

import Prototype.factory.ChPizzaStore;
import Prototype.factory.NyPizzaStore;
import Prototype.factory.PizzaStore;
import Prototype.product.Pizza;
import org.junit.Test;

public class FactoryMethodTest {
    @Test
    public void nyPizzaStoreTest() {
        PizzaStore pizzaStore = new NyPizzaStore();
        Pizza nyCheesePizza = pizzaStore.orderPizza("Cheese");
        Pizza nyVegglePizza = pizzaStore.orderPizza("Veggle");
        System.out.println(nyCheesePizza);
        System.out.println(nyVegglePizza);

    }

    @Test
    public void chPizzaStoreTest() {
        PizzaStore pizzaStore = new ChPizzaStore();
        Pizza nyCheesePizza = pizzaStore.orderPizza("Cheese");
        Pizza nyVegglePizza = pizzaStore.orderPizza("Veggle");
        System.out.println(nyCheesePizza);
        System.out.println(nyVegglePizza);

    }
}

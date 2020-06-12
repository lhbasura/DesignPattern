package FactoryMethod;

import FactoryMethod.factory.ChPizzaStore;
import FactoryMethod.factory.NyPizzaStore;
import FactoryMethod.factory.PizzaStore;
import FactoryMethod.product.*;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

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

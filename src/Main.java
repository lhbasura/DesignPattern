import FactoryMethod.factory.NyPizzaStore;
import FactoryMethod.factory.PizzaStore;
import FactoryMethod.product.Pizza;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[]args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        PizzaStore store=new NyPizzaStore();
        Pizza pizza1=store.orderPizza("cheese");
        Pizza pizza2=store.orderPizza("veggle");
    }
}

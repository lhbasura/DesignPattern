package FactoryMethod.factory;

import FactoryMethod.product.Pizza;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NyPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        char []arr=type.toCharArray();
        arr[0]-=32;
        String className="FactoryMethod.product.Ny"+String.valueOf(arr)+"Pizza" ;
        Class<?> c=Class.forName(className);
        Constructor<?> constructor=c.getConstructor();
        Pizza pizza= (Pizza) constructor.newInstance();
        return pizza;
    }
}

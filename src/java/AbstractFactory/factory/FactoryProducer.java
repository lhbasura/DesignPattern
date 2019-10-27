package AbstractFactory.factory;

import java.lang.reflect.Constructor;

public class FactoryProducer {
    public static CarFactory factory(String type) throws Exception
    {
        char[]arr=type.toCharArray();
        String className=String.valueOf(arr)+"Factory";
        Class<?>c=Class.forName("AbstractFactory.factory."+className) ;
        Constructor<?> constructor=c.getConstructor();
        CarFactory factory= (CarFactory) constructor.newInstance();
        return factory;
    }

}

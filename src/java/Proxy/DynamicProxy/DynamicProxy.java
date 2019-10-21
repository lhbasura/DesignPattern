package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
    Object target;
    public DynamicProxy(Object target)
    {
        this.target=target;
    }

    public <T> T getProxy()
    {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }
    private void before()
    {
        System.out.println("before dynamicProxy");
    }
    private void after()
    {
        System.out.println("after dynamicProxy");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result=method.invoke(target,args);
        after();
        return result;
    }
}

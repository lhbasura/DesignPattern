package Proxy.CglibProxy;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void test()
    {
        CglibProxy proxy=new CglibProxy();
        ProductService productService=proxy.getProxy(ProductService.class);
        productService.sell();


    }

}

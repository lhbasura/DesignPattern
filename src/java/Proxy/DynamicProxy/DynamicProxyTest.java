package Proxy.DynamicProxy;

import org.junit.jupiter.api.Test;

public class DynamicProxyTest {
    @Test
    public  void test()
    {
        MailService mailService=new MailServiceImp();
        DynamicProxy dynamicProxy=new DynamicProxy(mailService);
        MailService service= dynamicProxy.getProxy();
        service.sendMail();

    }

}

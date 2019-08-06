package DynamicProxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    public  void test()
    {
        MailService mailService=new MailServiceImp();
        DynamicProxy dynamicProxy=new DynamicProxy(mailService);
        MailService service= (MailService) Proxy.newProxyInstance(mailService.getClass().getClassLoader(),
                mailService.getClass().getInterfaces(),dynamicProxy);
        service.sendMail();

    }

}

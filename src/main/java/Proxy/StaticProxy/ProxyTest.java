package Proxy.StaticProxy;

import Proxy.StaticProxy.model.User;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void test()
    {
        UserService userService=new UserProxy();
        User user=new User();
        user.setUsername("admin");
        user.setPassword("secret");
        userService.login(user);
    }
}

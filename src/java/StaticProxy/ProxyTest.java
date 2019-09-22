package StaticProxy;

import StaticProxy.model.User;
import org.junit.jupiter.api.Test;

public class ProxyTest {
    @Test
    void test()
    {
        UserService userService=new UserProxy();
        User user=new User();
        user.setUsername("admin");
        user.setPassword("secret");
        userService.login(user);
    }
}

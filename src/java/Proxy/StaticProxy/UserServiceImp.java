package Proxy.StaticProxy;

import Proxy.StaticProxy.model.User;

public class UserServiceImp implements UserService{

    @Override
    public boolean login(User user) {
        if(user.getUsername().equals("admin")&&user.getPassword().equals("secret"))
        {
            System.out.println("login success");
            return true;
        }
        System.out.println("login failed");
        return false;
    }
}

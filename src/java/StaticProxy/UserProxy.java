package StaticProxy;

import StaticProxy.model.User;

public class UserProxy implements UserService {
    private UserService userService;

    void initUserService()
    {
        userService=new UserServiceImp();
    }

    public UserProxy(){
        this.userService=new UserServiceImp();
    }

    public void checkLogin(User user) {
        if (user.getPassword().length() < 8) {
            System.out.println("warn:your password length  is less than 8");
        }
    }

    @Override
    public boolean login(User user) {
        checkLogin(user);
        return userService.login(user);
    }

}

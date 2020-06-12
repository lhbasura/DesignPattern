package Proxy.DynamicProxy;

public class MailServiceImp implements MailService{
    @Override
    public void sendMail() {
        System.out.println("you send a mail");
    }
}

package Facade;

public class Comic implements Book{
    @Override
    public void read() {
        System.out.println("read the comic");
    }
}

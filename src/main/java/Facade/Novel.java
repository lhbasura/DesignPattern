package Facade;

public class Novel implements Book{
    @Override
    public void read() {
        System.out.println("read the novel");
    }
}

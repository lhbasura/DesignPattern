package Facade;

public class WordBook implements Book{
    @Override
    public void read() {
        System.out.println("read the wordbook");
    }
}

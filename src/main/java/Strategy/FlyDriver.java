package Strategy;

public class FlyDriver implements Driver {
    @Override
    public void start(String name) {
        System.out.println(name + " is flying");
    }
}

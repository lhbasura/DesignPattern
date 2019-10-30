package Strategy;

public class RunDriver implements Driver {
    @Override
    public void start(String name) {
        System.out.println(name + " is running");
    }
}

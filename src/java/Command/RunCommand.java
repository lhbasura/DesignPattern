package Command;

public class RunCommand extends Command{
    @Override
    public void execute() {
        receiver.run();
    }
}

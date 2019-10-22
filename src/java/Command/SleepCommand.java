package Command;

public class SleepCommand extends Command{
    @Override
    public void execute() {
        receiver.sleep();
    }
}

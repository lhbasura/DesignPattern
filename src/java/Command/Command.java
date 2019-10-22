package Command;

public abstract class Command {
    Receiver receiver;
    public void setReceiver(Receiver receiver)
    {
        this.receiver=receiver;
    }
    public abstract void execute();
}

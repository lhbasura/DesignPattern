package Command;

public abstract class Command {
    private Receiver receiver;

    public Receiver getReceiver() {
        return receiver;
    }
    public void execute(){
        
    };
}

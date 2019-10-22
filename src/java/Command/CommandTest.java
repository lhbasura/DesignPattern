package Command;

import org.junit.Test;

public class CommandTest {
    @Test
    public void test(){
        Receiver receiver=new Receiver();
        Command runCommand=new RunCommand();
        Command sleepCommand=new SleepCommand();
        runCommand.setReceiver(receiver);
        sleepCommand.setReceiver(receiver);
        runCommand.execute();
        sleepCommand.execute();
    }
}

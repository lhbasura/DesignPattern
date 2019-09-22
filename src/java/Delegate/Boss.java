package Delegate;

public class Boss {
    static void command(String command , Leader leader)
    {
        leader.doing(command);
    }
}

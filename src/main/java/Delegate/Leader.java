package Delegate;


import java.util.HashMap;

public class Leader implements Employee{
    private HashMap<String,Employee> targets = new HashMap<>();
    public void addEmployee(String command,Employee employee){
        targets.put(command, employee);
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}

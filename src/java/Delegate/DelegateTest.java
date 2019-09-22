package Delegate;

import org.junit.jupiter.api.Test;

public class DelegateTest {
    @Test
    public void doing() {
        EmployeeA employeeA = new EmployeeA();
        EmployeeB employeeB = new EmployeeB();
        Leader leader = new Leader();
        leader.addEmployee("dance", employeeA);
        leader.addEmployee("singing", employeeB);
        Boss.command("dance", leader);
        Boss.command("singing", leader);
    }
}

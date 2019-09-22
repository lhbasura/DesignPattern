package Delegate;

public class EmployeeB implements Employee {
    @Override
    public void doing(String command) {
        System.out.println("我是EmployeeB 我正在执行" + command + "操作");

    }
}

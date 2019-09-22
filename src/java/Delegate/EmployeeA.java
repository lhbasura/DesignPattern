package Delegate;

public class EmployeeA implements Employee {
    @Override
    public void doing(String command) {
        System.out.println("我是EmployeeA 我正在执行" + command + "操作");

    }
}

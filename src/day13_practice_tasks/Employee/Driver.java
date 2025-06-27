package day13_practice_tasks.Employee;

public class Driver extends Employee {
    public Driver(String name, int age, String employeeID, double salary, String companyName) {
        super(name, age, employeeID,"Driver", salary, companyName);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(getName() + " is driving");
    }
}

/*
 2.4 Driver:
       - work(): Displays "[name] is driving".
 */
package day13_practice_tasks.Employee;

public class Teacher extends Employee {

    public Teacher(String name, int age, String employeeID, double salary, String companyName) {
        super(name, age, employeeID, "Teacher" ,salary, companyName);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(getName() + " is teaching");
    }
}
/*
 2.3 Teacher:
       - work(): Displays "[name] is teaching".

 */

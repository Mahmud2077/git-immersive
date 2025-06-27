package day07_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "John Doe";
        employee1.age = 25;
        employee1.gender = 'M';
        employee1.jobTitle = "Software Engineering";
        employee1.salary = 1_000_000;

        System.out.println(employee1);
        employee1.work();

        System.out.println();

        Employee employee2 = new Employee();
        employee2.name = "JAMES Doe";
        employee2.age = 35;
        employee2.gender = 'M';
        employee2.jobTitle = "Civil Engineering";
        employee2.salary = 3_000_000;

        System.out.println(employee2);
        employee2.work();

    }
}

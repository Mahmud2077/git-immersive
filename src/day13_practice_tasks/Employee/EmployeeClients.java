package day13_practice_tasks.Employee;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester tester = new Tester("James", 40,"M157",1_000_000, "M16");
        System.out.println(tester);
        tester.work();

        Driver driver = new Driver("Tuna", 24,"TurkTir",120_000,"Sanayi01");
        System.out.println(driver);
        driver.work();

        Teacher teacher = new Teacher("John", 32,"Cel21", 80_000, "MiddlesexC");
        System.out.println(teacher);
        teacher.work();

        Developer developer = new Developer("Mahmud", 30, "MT12", 140_000,
                "Amazon", "JAVA");

        System.out.println(developer);
        developer.work();


    }
}

/*

4. Create a class named "EmployeeClients":
   - Create multiple objects representing different employees.
   - Test the methods and attributes of each object.
 */

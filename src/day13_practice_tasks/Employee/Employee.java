package day13_practice_tasks.Employee;

public class Employee extends Person {

    private String employeeID;
    private String jobTitle;
    private double salary;
    private String companyName;

    public Employee(String name, int age, String employeeID, String jobTitle, double salary, String companyName) {
        super(name, age);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }
    public void work(){
        System.out.println(jobTitle + " " + getName());
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}

/*
2. Create a subclass of Person named "Employee" with the following specifications:
   Attributes:
       - employeeId: String
       - jobTitle: String
       - salary: double
       - companyName: String

   Encapsulation All the fields.
       Condition:
            Salary cannot be zero or negative

   Add a constructor to initialize all fields.

   Methods:
       - work(): Displays the employee's job title and name.
       - toString(): Returns a string representation of the Employee object.


 */
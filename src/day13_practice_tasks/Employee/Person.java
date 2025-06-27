package day13_practice_tasks.Employee;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println(name + " is eating");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/*
Employee Task Requirements:
1. Create a class named "Person" with the following specifications:
   Attributes:
       - name: String
       - age: int

   Encapsulation All the fields.
        Conditions:
            Name can not be set to null or empty
            Age can not be set to zero or negative

   Add a constructor to initialize all fields.

   Actions:
       - eat(): Displays the person's name with the message " is eating"
       - sleep(): Displays the person's name with the message " is sleeping"
       - toString(): Returns a string representation of the Person object.









   - Add any additional fields or methods as necessary.


4. Create a class named "EmployeeClients":
   - Create multiple objects representing different employees.
   - Test the methods and attributes of each object.

 */

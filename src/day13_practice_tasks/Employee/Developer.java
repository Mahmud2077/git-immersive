package day13_practice_tasks.Employee;


public class Developer extends Employee {

        private String programmingLanguage;

        public Developer(String name, int age, String employeeID, double salary, String companyName, String programmingLanguage) {
            super(name, age, employeeID,"Developer", salary, companyName);
            this.programmingLanguage = programmingLanguage;
        }

    @Override
    public void work() {
        super.work();
        System.out.println(" is coding in " + programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}







/*
2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".

 */
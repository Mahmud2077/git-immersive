package day11_practice_tasks;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;


    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;



        }

        public void takeOrder() {
            System.out.println(name + " is taking an order");
        }

        public void cleanTable() {
            System.out.println(name + " is cleaning the table");

        }


    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                "," + (isFullTime ? "full-time" : "part-time") +
                '}';
    }
}

/*
Create a custom class named Server with similar specifications:

	Attributes:
			name (String)
			employeeID (int)
			hourlyRate (double)
			fullTime (boolean)

	Add A constructor that can set all the fields.

    Actions:
		takeOrder(): server's name + "is taking an order"
	    cleanTable(): server's name + "is cleaning the table"
		toString(): returns a string representation of a Chef, including full-time or part-time status

 */

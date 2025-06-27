package day11_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String location;
    public int numbersOfStairs;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    public Restaurant(String owner, String location, int numbersOfStairs) {
        this.owner = owner;
        this.location = location;
        this.numbersOfStairs = numbersOfStairs;
        servers = new ArrayList<>(); // creating array method for server object
        chefs = new ArrayList<>();  // creating array method for chef object
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServer(Server[] servers) {
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs) {
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateServer(int id) {
        servers.removeIf(p -> p.employeeID == id);
    }

    public void terminateChef(int id) {
        chefs.removeIf(p -> p.employeeID == id);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numbersOfStairs=" + numbersOfStairs +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }
}
/*
Create a custom class named Restaurant with the following specifications:

	Attributes:
			Owner (String)
			Location (String)
			numberOfStars (int)
			Servers (ArrayList of Server objects)
			Chefs (ArrayList of Chef objects)

	Add a constructor that sets the owner, location, and number of stars.

	Actions:
		hireServer(Server server): adds a server object to the Servers ArrayList
		hireServer(Server[] servers): adds an array of Server objects to the Servers ArrayList
		hireChef(Chef chef): adds a chef object to the Chefs ArrayList
		hireChef(Chef[] chefs): adds an array of Chef objects to the Chefs ArrayList
		terminateChef(int employeeID): removes the chef with the matching ID from the Chefs ArrayList
		terminateServer(int employeeID): removes the server with the matching ID from the Servers ArrayList
		toString(): returns a string representation of the Restaurant object, including the number of Servers and Chefs alongside other information

 */
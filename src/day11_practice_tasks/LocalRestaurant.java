package day11_practice_tasks;


public class LocalRestaurant {

    public static void main(String[] args) {

        Server[] servers = {
                new Server("Yasin", 29, 15, false),
                new Server("Sabiryy", 28, 10, false),
                new Server("Karim", 27, 12, true),
                new Server("Aysel", 25, 23, true),
        };

        Chef[] chefs = {
                new Chef("Halim", 54, 35, true),
                new Chef("Habib", 25,26, false),
                new Chef("Hakim", 50, 29, true),

        };

        Restaurant restaurants = new Restaurant("Mahdi", "McLean", 4);

        restaurants.hireServer(servers);
        restaurants.hireChef(chefs);

        System.out.println(restaurants);

        System.out.println(restaurants.servers);

        restaurants.hireServer(new Server("Mona", 30, 23, true));
        System.out.println(restaurants.servers);

        restaurants.terminateChef(22);

        System.out.println(restaurants.chefs);

        System.out.println(restaurants);

    }

}


/*
Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information
 */

package day14_practice_tasks;

public class Toyota extends Car{

    public Toyota( String model, int year, double price, String color) {
        super("Toyota" , model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Starting quickly");
    }

    @Override
    public void driver() {
        System.out.println("Driving smooth");
    }
}

/*
5. Create a Subclass of Car Named 'Toyota'.
 */

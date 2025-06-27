package day14_practice_tasks;

public class Audi extends Car implements AutoPark{
    public Audi( String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Audi parks on its own");
    }

    @Override
    public void start() {
        System.out.println("Starts with key");
    }

    @Override
    public void driver() {
        System.out.println("Drive quickly");
    }
}

//Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
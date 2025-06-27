package day14_practice_tasks;

public class Tesla extends  Car implements AutoPark, AutoPilot {


    public Tesla( String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Driving while you sleep");
    }

    @Override
    public void selfDrive() {
        System.out.println("Parking on its own");

    }

    @Override
    public void start() {
        System.out.println("Start with face");

    }

    @Override
    public void driver() {
        System.out.println("Drive quietly");

    }
}

//Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark
// and AutoPilot Interfaces.

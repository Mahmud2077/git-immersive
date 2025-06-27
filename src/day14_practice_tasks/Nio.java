package day14_practice_tasks;



public class Nio extends Car implements AutoPark, AutoPilot {

    public Nio( String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Nio drive mode");
    }

    @Override
    public void selfDrive() {
        System.out.println("Nio park mode");

    }

    @Override
    public void start() {
        System.out.println("Start in a cool way");

    }

    @Override
    public void driver() {
        System.out.println("Driving in the Nio way");
    }
}

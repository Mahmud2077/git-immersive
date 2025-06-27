package day14_practice_tasks;

public class Mercedes extends Car implements AutoPark{
    public Mercedes( String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto park enabled");
    }

    @Override
    public void start() {
        System.out.println("Start with button");

    }

    @Override
    public void driver() {
        System.out.println("Drive very smooth");

    }
}

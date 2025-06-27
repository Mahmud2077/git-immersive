package day14_practice_tasks;

public class BMW extends Car{
    public BMW(String model, int year, double price, String color) {
        super("BMW" , model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Staring loudly");
    }

    @Override
    public void driver() {
        System.out.println("driving loudly");

    }
}

//Create a Subclass of Car Named 'BMW'.
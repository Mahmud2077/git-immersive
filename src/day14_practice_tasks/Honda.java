package day14_practice_tasks;

public class Honda extends Car {
    public Honda(String model, int year, double price, String color) {
        super("Honda" , model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Starting quickly");
    }

    @Override
    public void driver() {
        System.out.println("Driving okay");

    }
}

//Create a Subclass of Car Named 'Honda'.
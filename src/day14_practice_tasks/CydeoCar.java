package day14_practice_tasks;

import java.sql.SQLOutput;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{
    public CydeoCar( String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Park in the sky");

    }

    @Override
    public void selfDrive() {
        System.out.println("Drive by AI");

    }

    @Override
    public void start() {
        System.out.println("Start by thinking");

    }

    @Override
    public void driver() {
        System.out.println("Start self drive");

    }

    @Override
    public void fly() {
        System.out.println("In fly mode");

    }
}

//reate a Subclass of Car Named 'CydeoCar' that
// Implements AutoPark, AutoPilot, and Flyable Interfaces.
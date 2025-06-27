package day14_practice_tasks;

public class CarClients {
    public static void main(String[] args) {


        Toyota toyota = new Toyota("Camry", 2022, 25000.5, "Silver");
        System.out.println(toyota);
        toyota.start();
        toyota.driver();
        toyota.stop();
        System.out.println("--------------------------------");

        Honda honda = new Honda("Civic", 2019, 20000.0, "Black");
        System.out.println(honda);
        honda.start();
        honda.driver();
        honda.stop();
        System.out.println("--------------------------------");

        BMW bmw = new BMW("BMW", 2018, 35000.0, "White");
        System.out.println(bmw);
        bmw.start();
        bmw.driver();
        bmw.stop();
        System.out.println("--------------------------------");

        Audi audi = new Audi("Audi", 2018, 18000.0, "Green");
        System.out.println(audi);
        audi.start();
        audi.driver();
        audi.stop();
        audi.autoPark();
        System.out.println("--------------------------------");

        Mercedes mercedes = new Mercedes("Mercedes", 2024, 48000.0, "Red");
        System.out.println(mercedes);
        mercedes.start();
        mercedes.driver();
        mercedes.stop();
        mercedes.autoPark();
        System.out.println("--------------------------------");

        Tesla tesla = new Tesla("Tesla", 2024, 58000.0, "Gold");
        System.out.println(tesla);
        tesla.start();
        tesla.driver();
        tesla.stop();
        tesla.autoPark();
        tesla.selfDrive();
        System.out.println("-------------------------------");

        Nio nio = new Nio("Nio", 2024, 68000.0, "SkyBlue");
        System.out.println(nio);
        nio.start();
        nio.driver();
        nio.stop();
        nio.autoPark();
        nio.selfDrive();
        System.out.println("-------------------------------");

        CydeoCar cydeoCar = new CydeoCar("CydeoCar", 2025, 108000.0, "Blue");
        System.out.println(cydeoCar);
        cydeoCar.start();
        cydeoCar.driver();
        cydeoCar.stop();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();
        System.out.println("-------------------------------");




    }
}

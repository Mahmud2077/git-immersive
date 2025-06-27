package day07_practice_tasks;

public class AddressClients {
    public static void main(String[] args) {

        Address homeAddress = new Address();
        homeAddress.buildingNumber = 158;
        homeAddress.street = "Rectangle street";
        homeAddress.city = "Queens";
        homeAddress.state = "New York";
        homeAddress.zipcode = "12345";
        System.out.println(homeAddress);

        System.out.println();


        Address officeAddress = new Address();
        officeAddress.buildingNumber = 158;
        officeAddress.street = "Office street";
        officeAddress.city = "Manhattan";
        officeAddress.state = "New York";
        officeAddress.zipcode = "125879";
        System.out.println(officeAddress);
    }
}

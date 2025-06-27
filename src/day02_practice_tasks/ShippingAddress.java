package day02_practice_tasks;

public class ShippingAddress {

    public static void main(String[] args) {

        String fullName = "Aaron Kissinger",
                streetName = "Legacy Circle",
                city = "Fairfax",
                state = "VA";

         int builderNumber = 13621,
                 zipCode = 22030;

        System.out.println("Your shipping address is:");
        System.out.println("\t\t\t" + fullName);
        System.out.println("\t\t\t" + builderNumber + " " + streetName);
        System.out.println("\t\t\t" + city + ", " + state + " " + zipCode);





    }


}

/*
4. Create a class named ShippingAddress and write a program with the following requirements:

	Declare the following variables with appropriate data types:
 			fullName
			buildingNumber
			streetName
			city
			state
			zipCode

	Use concatenation to print the full shipping address

			Example:
				fullName = "Aaron Kissinger";
				buildingNumber = 13621;
				streetName = "Legacy Circle"
				city = "Fairfax;
				state = "VA";
				zipCode = 22030;

			Output:
	      		Your Shipping address is:
                			Aaron Kissinger
                			13621 Legacy Circle
                			Fairfax, VA 22030

 */
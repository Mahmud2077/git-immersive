package day13_practice_tasks;

public class Samsung extends Phone {
    public Samsung(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public void developMode(){
        System.out.println("Opened developer settings");
    }
}

/*
Create a class named 'Samsung' with these specifications:
   Attributes:
       - Same as Phone.

   Encapsulation:
       - Same conditions as Phone.

   Constructor:
       - Same as Phone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - developMode: Display "Opened developer settings"
       - toString(): Prints the information of the Samsung object.

 */

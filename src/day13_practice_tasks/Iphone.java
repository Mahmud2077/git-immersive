package day13_practice_tasks;

public class Iphone extends Phone {
    public Iphone(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public void faceTime(long phoneNumber) {
        System.out.println("FaceTiming with the number " + phoneNumber);

    }
}

/*
Create a class named 'IPhone' with these specifications:
   Attributes:
       - Same as Phone.

   Encapsulation:
       - Same conditions as Phone.

   Constructor:
       - Same as Phone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - faceTime(phoneNumber): Display "facetiming with the number [phoneNumber]".
       - toString(): Prints the information of the IPhone object.

 */

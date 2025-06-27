package day13_practice_tasks;

public class PhoneClients {

    public static void main(String[] args) {


        Iphone iphone = new Iphone("Apple", "IPhone X", "16", 1000, "Gold");
        System.out.println(iphone);
        iphone.faceTime(2076072538L);
        iphone.call(2076072638L);
        iphone.text(2076072638L);
        iphone.setPrice(950);
        System.out.println(iphone);

        Samsung samsung = new Samsung("Samsung", "Note", "15", 1000, "Black");
        System.out.println(samsung);

        Nokia nokia = new Nokia("Nokia", "V10", "17", 1000, "Silver");
        System.out.println(nokia);

    }
}

/*
5. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object
 */
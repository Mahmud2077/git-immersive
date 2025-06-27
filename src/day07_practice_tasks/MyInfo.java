package day07_practice_tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your gender");
        String gender = input.next();

        input.nextLine(); // empty enter input

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your zipcode");
        String zipCode = input.nextLine();

        input.nextLine();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state name");
        String stateName = input.nextLine();

        System.out.println("Enter your building number");
        int buildingNumber = input.nextInt();

        System.out.println("Enter your street name");
        input.nextLine();
        String streetName = input.nextLine();

        input.close();

        String result = fullName + "\n" + age + "\n" + gender + "\n"  + schoolName + "\n" + phoneNumber + "\nAddress\n\t" + buildingNumber +
                " " + streetName + "\n\t" + cityName + "," + stateName + " " + zipCode;

        System.out.println(result);


    }
}


/*
Create a class called MyInfo and ask the user to:

      Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode
 */
package day07_practice_tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();

        double area = radius * radius * 3.14;
        double perimeter = 2 * radius * 3.14;

        System.out.println("The radius " + radius);
        System.out.println("The area of the circle is " + area);
        System.out.println("The perimeter of the circle is " + perimeter);
    }
}

/*
Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4
 */
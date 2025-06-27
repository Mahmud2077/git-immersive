package day05_practice_tasks;

/*
Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 =)
 */

public class FactorialNumber {

    public static void main(String[] args) {

        int num = 5;
        int factorial = 1;

        while (num > 1) {
            factorial *= num--; // factorial = factorial * num


        }

        System.out.println(factorial);

    }
}

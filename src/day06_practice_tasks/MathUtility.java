package day06_practice_tasks;

public class MathUtility {

    public static void main(String[] args) {

        System.out.println(calculate(1, '*', 10));
        System.out.println(calculate(3.5, '+', 2.1));
        System.out.println(square(4));
        System.out.println(square(4.5));
        System.out.println(cube(3));

    }

    public static int calculate(int num1, char operator, int num2) {

        return (int) (calculate((double) num1, operator, num2));

    }

    public static double calculate(double num1, char operator, double num2) {

       return switch (operator){
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            case '%' -> num1 % num2;
            default -> 0;
        };

    }

    public static int square(int num) {
        return num * num;
    }

    public static double square(double num) {
        return num * num;
    }

    public static int cube(int num) {
        return num * num * num;

    }
    public static double cube(double num) {
        return num * num * num * num;
    }


}

/*
5. Create a class named MathUtility:

	5.1 Create a method named calculate that takes three arguments (Two integers and a char) and returns the result based on the operator.

		If the operator is +:
			The method should return the addition of the two numbers

		If the operator is -:
			The method should return the subtraction of the two numbers

		If the operator is *:
			The method should return the multiplication of the two numbers

		If the operator is /:
			The method should return the multiplication of the two numbers

	for any other operators, the method should return 0


			Example:
				int result = calculate(10, '+', 20);

			Output:
				30


	5.2 Overload the calculate method to handle double numbers.

			Example:
				double result = calculate(2.5, '*', 3.0);

			Output:
				7.5


	5.3 Create a method named square that takes an int and returns the square, hierarchically calling the
	calculate method to calculate the square.

			Example:
				int num = square(8);

			Output:
				64

	5.4 Overload the square method for double numbers.

			Example:
				double num = square(1.5);

			Output:
				2.25

	5.5 Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9

	5.6 Overload the cube method for double numbers.

			Example:
				double num = cube(2.5);

			Output:
				15.625
 */
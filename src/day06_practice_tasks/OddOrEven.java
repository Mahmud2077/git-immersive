package day06_practice_tasks;


public class OddOrEven {

    public static void main(String[] args) {
        System.out.println(isOdd(3));
        System.out.println(isOdd(4));
        System.out.println(isEven(3));
        System.out.println(isEven(4));
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

}

//public static boolean isOdd(int number) {
//  if (number % 2 == 1) {
//    return true;
//}else {
//   return false;
//}

//}



/*
1. Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true
 */
package java_iinterview_practice_with_Adam.List;

public class FizzBuzz {

    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }

            System.out.println(i);


        }
    }
}

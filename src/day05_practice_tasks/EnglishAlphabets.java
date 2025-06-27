package day05_practice_tasks;

/*
2. Create a class named EnglishAlphabets, and write a program that displays alphabet letters from A to Z in the
        same line separated by a space.
 */


public class EnglishAlphabets {

    public static void main(String[] args) {

       for(char letter = 'A'; letter <= 'Z'; letter++) {
           System.out.print(letter + " ");
       }
    }
}

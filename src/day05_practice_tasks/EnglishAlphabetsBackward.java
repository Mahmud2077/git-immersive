package day05_practice_tasks;
/*
3. Create a class named EnglishAlphabetsBackward, and write a program that can display the alphabet letters from Z to A in
the same line separated
 */


public class EnglishAlphabetsBackward {

    public static void main(String[] args) {

       for(char letter = 'Z'; letter >= 'A'; letter--) {
           System.out.print(letter + " ");
       }
    }
}

package day08_practice_tasks;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");

        String word = input.next();
        input.close();


        if (word.charAt(0) == 'X') {
            word = "a" + word.substring(1);
        }
        System.out.println(word);


    }

}




/*
Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex
 */

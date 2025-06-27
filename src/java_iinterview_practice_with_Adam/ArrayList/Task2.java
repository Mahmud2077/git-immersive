package java_iinterview_practice_with_Adam.ArrayList;

import java.util.ArrayList;
import java.util.List;



public class Task2 {

    public static void main(String[] args) {

      List<String> newList = new ArrayList<>();
      newList.add("level");
      newList.add("word");
      newList.add("madam");
      newList.add("hello");

        System.out.println("palindrome(newList) = " + palindrome(newList));

    }

    public static List<String> palindrome(List<String> list) {

        List<String> palindrome = new ArrayList<>();

        String newWord = "";

        for(String word : list) {
            boolean result = isPalindrome(word);

            if(result) {
                palindrome.add(word);
            }
        }


        return palindrome;
    }

    private static boolean isPalindrome(String word) {
        StringBuilder newWord = new StringBuilder(word);

        return newWord.reverse().toString().equals(word);
    }

}

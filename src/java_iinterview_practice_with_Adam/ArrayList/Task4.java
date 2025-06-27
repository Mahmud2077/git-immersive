package java_iinterview_practice_with_Adam.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<String> newList = new ArrayList<>(List.of("Java", "is", "fun"));

        System.out.println(listToSentence(newList));

    }


    private static String listToSentence(List<String> newList) {

        String Result = "";

        for (String str : newList) {

            Result += str + " ";
        }
      return Result.trim();
    }
}

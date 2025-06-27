package java_iinterview_practice_with_Adam.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<String> newList = new ArrayList<>();

        newList.add("Apple");
        newList.add("is");
        newList.add("a");
        newList.add("fruit");

        int numOfCharacters = 3;

        System.out.println(checkingCharacterOfList(newList, numOfCharacters));


    }

    private static List<String> checkingCharacterOfList(List<String> newList, int numOfCharacters) {

        List<String> newListOfCharacters = new ArrayList<>();

        for (String word : newList) {
            if (word.length() >= numOfCharacters) {
                newListOfCharacters.add(word);
            }


        }

        return newListOfCharacters;
    }
}

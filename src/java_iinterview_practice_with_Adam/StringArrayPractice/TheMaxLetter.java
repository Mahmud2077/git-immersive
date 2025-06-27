package java_iinterview_practice_with_Adam.StringArrayPractice;

import java.util.Collections;
import java.util.List;

public class TheMaxLetter {

    public static void main(String[] args) {

        System.out.println(mostFrequentChar("mahMut"));

    }

    public static char mostFrequentChar(String str) {

        List<String> letters = List.of(str.split(""));

        int max = Integer.MIN_VALUE;
        char result = ' ';

        for (String eachLetter : letters) {


            if(Collections.frequency(letters, eachLetter)>max){
                max = Collections.frequency(letters, eachLetter);
                result = eachLetter.charAt(0);
            }
        }
        return result;

    }

}

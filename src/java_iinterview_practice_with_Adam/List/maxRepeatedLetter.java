package java_iinterview_practice_with_Adam.List;

import java.util.Collections;
import java.util.List;

public class maxRepeatedLetter {

    public static void main(String[] args) {

        System.out.println(mostFrequentChar("test"));

    }

    public static char mostFrequentChar(String str){

        List<String> letters = List.of(str.split(""));//t,e,s,t

        int max = Integer.MIN_VALUE;
        char res =' ';

        for (String eachLetter : letters) {

          if(Collections.frequency(letters, eachLetter) > max){
              max=Collections.frequency(letters, eachLetter);
              res=eachLetter.charAt(0);
          }
        }
        return res;

    }



}

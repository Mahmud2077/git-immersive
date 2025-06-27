package java_iinterview_practice_with_Adam.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");

        System.out.println(changeChar(list));

    }
    public static List<String> changeChar(List<String> list) {

        List<String> result = new ArrayList<>();

        for(String str : list) {
            result.add(preparedWords(str));

        }
        return result;
    }

    public static String preparedWords(String str) {

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
              str =  str.replaceAll(str.charAt(i)+"", "*");
            }
        }
       return str;
    }
}

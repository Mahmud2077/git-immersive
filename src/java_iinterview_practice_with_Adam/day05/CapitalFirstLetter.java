package java_iinterview_practice_with_Adam.day05;

public class CapitalFirstLetter {

    // make the each first letter of word capital
    public static void main(String[] args) {

        String str = "hello mahmut ekmekci";

        System.out.println(convertAndMakeCapital(str));

    }

    private static String convertAndMakeCapital(String str) {

        String[] words = str.split(" ");

        String result ="";

        for (String word : words) {
           word = (word.charAt(0)+"").toUpperCase()+word.substring(1);

           result += word + " ";

        }
        return result.trim();
    }



}

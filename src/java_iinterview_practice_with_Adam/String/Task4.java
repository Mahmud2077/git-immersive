package java_iinterview_practice_with_Adam.String;

public class Task4 {

    //create custom method to get first char of word and last char of word
    // then combine with one space between

    public static void main(String[] args) {

        String str = "testing string";
        System.out.println("firstAndLastChar(str) = " + firstAndLastChar(str));

    }
    private static String firstAndLastChar(String str) {
        if (str == null) {
            return "String is null";
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        str = firstChar + " "  + lastChar;
        return str;

    }

}

package java_iinterview_practice_with_Adam.StringArrayPractice;

public class BiggerWord {

    public static void main(String[] args) {

        String str = "Today is a beautiful day";


        System.out.println(longeststr(str));

    }

    private static String longeststr(String str) {

        String[] arr = str.split(" ");
        //Get each word one by one


        //create a new empty String to put our result
        String maxLengthWord = "";

        //find each length of the word
        for (String each : arr) {
            if(each.length() > maxLengthWord.length()) {
                maxLengthWord = each;
            }

        }return maxLengthWord;



    }
}

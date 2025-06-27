package java_iinterview_practice_with_Adam.day05;

public class countVowels {

    public static void main(String[] args) {

        String a = "Adam";

        System.out.println(countVowels(a));


    }

    public static int countVowels(String str) {

        int count = 0;

        for(char each : str.toLowerCase().toCharArray()) {

            if("aeiou".indexOf(each) != -1) {
           // if(each=='a' || each=='o'||each=='e'||each=='i'||each=='u') {
                count++;
            }
        }
        return count;

    }


}

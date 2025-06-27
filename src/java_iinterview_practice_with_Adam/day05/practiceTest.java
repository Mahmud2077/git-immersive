package java_iinterview_practice_with_Adam.day05;

public class practiceTest {

    public static void main(String[] args) {

        String str = "Testtest";

        System.out.println(removeTheDuplicates(str));

    }

    private static String removeTheDuplicates(String str) {

        StringBuilder sb = new StringBuilder();
        String result ="";

        for(char each : str.toCharArray()) {
            if(!result.contains(each+"")){
                result +=each;
            }
        }
        return result;
    }

}

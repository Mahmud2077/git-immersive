package java_iinterview_practice_with_Adam.day05;

public class removeDuplicates {


    public static void main(String[] args) {

        String str = "testtest";

        System.out.println(removeDuplicates(str));

    }

    public static String removeDuplicates(String str) {

        StringBuilder sb = new StringBuilder();
        String result = "";

        for (char each : str.toCharArray()) {
            if (!result.contains(each + "")) {
                result += each;

            }
        }
        return result;
    }
}

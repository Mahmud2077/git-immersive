package java_iinterview_practice_with_Adam.String;

/**
 * Write a method that counts how many times a specific character appears in the string.
 * Example: "banana", 'a' -> 3
 */
public class Task5 {

    public static void main(String[] args) {

        String str = "banana";
        char chr = 'a';

        System.out.println("specificChar(str,chr) = " + specificChar(str, chr));

    }

    private static int specificChar(String str, char chr) {

        int count = 0;

        if (str == null) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);
            if (current == chr) {
                count++;
            }
        }
            return count;

    }


}

package java_iinterview_practice_with_Adam.String;

public class Task1 {

    public static void main(String[] args) {

        String str1 ="Hello World";
        characterCount(str1);

    }

    public static int characterCount(String strLocal) {

        int count = 0;
        for (int i = 0; i < strLocal.length(); i++) {
            count++;
        }
        System.out.println(count);

        return count;
    }
}

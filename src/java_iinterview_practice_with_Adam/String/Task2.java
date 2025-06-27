package java_iinterview_practice_with_Adam.String;

public class Task2 {

    public static void main(String[] args) {

        String str = "hello";
        System.out.println(upperCase(null));
    }

    public static String upperCase(String str) {
        if (str != null) {
            return str.toUpperCase();
        } else {
            return null;
        }


    }

}

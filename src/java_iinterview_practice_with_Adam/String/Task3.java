package java_iinterview_practice_with_Adam.String;

public class Task3 {


    public static void main(String[] args) {

        String str = "MahmuD";
        System.out.println(returnLowerCase(str));
        // we have to print to get see the results in the console


    }

    private static String returnLowerCase(String str) {

        if (str != null){
            return str.toLowerCase();
        }else{
            return null;
        }
    }


}


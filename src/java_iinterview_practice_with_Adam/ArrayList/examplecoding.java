package java_iinterview_practice_with_Adam.ArrayList;

public class examplecoding {


   public static void main(String[] args) {

       String str = "Java programming";

       for (int i = 0; i < str.length(); i++) {

           char ch = str.charAt(i);

           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'){

               System.out.print(ch + " ");
           }

       }




   }


}
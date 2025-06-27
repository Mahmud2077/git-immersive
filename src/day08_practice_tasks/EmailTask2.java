package day08_practice_tasks;

public class EmailTask2 {

    public static void main(String[] args) {


        String email = "Mahmut_Ekmekci@apple.com";

        int underscoreIndex = email.indexOf('_');
        int atIndex = email.lastIndexOf('@');
        int dotIndex = email.indexOf('.');

        String firstName = email.substring(0, underscoreIndex);
        String lastName = email.substring(underscoreIndex + 1, atIndex);
        String domain = email.substring(atIndex + 1, dotIndex);

        System.out.println("First Name: " + fixFormat (firstName));
        System.out.println("Last Name: " + fixFormat (lastName));
        System.out.println("Domain: " + fixFormat (domain));

    }
    public static String fixFormat(String str){
        str = str.toLowerCase();
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}

/*
Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple

 */

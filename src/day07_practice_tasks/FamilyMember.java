package day07_practice_tasks;

import java.util.Scanner;

public class FamilyMember {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" How many people do you live with?");
        int people = input.nextInt();
        input.close();

        String result;
        if (people < 3) {
            result = " live with less than 3 people";
        }else if (people < 6) {
            result = " live with 3 - 6 people";
        }else {
            result = " live with more than 6 people";
        }
        System.out.println(result);
    }

}

/*
SCANNERS TASKS:
5. Create a class named FamilyMembers and write a program that asks the user how many people they live with.

    If the user lives with fewer than three people, print "Live with less than three people."
    If the user lives with 3 - 6 people, print "Live with 3 - 6 people."
    If the user lives with more than six people, print "Live with more than six people."

        Example:
             How many people do you live with?
             Input: 3

        Output:
             Live with 3 - 6 people.

 */

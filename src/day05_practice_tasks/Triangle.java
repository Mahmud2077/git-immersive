package day05_practice_tasks;

/*
Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
 */

public class Triangle {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){

            for(int j = 0; j <= i; j++){ // this is for each star on each line
               // System.out.println(i + " " + j);
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}

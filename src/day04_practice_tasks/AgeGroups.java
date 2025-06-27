package day04_practice_tasks;

public class AgeGroups {


    public static void main(String[] args) {


            int age = 25;
            String result;
            if (age > 0 && age <= 150) { // valid age (1-150)

                if (age >= 1 && age <= 2) {
                    result = "Infant";
                } else if (age >= 3 && age <= 5) {
                    result = "Toddler";
                } else if (age >= 6 && age <= 9) {
                    result = "Kid";
                } else if (age >= 10 && age <= 12) {
                    result = "Pre-Teen";
                } else if (age >= 13 && age <= 17) {
                    result = "Young Adult";
                } else if (age >= 21 && age <= 39) {
                    result = "Adult";
                } else if (age >= 40 && age <= 49) {
                    result = "Young Middle-Aged Adult";
                } else if (age >= 50 && age <= 54) {
                    result = "Middle-Aged Adult";
                } else if (age >= 55 && age <= 64) {
                    result = "Very Young Senior Citizen";
                } else if (age >= 65 && age <= 74) {
                    result = "Young Senior Citizen";
                } else if (age >= 75 && age <= 84) {
                    result = "Senior Citizen";
                } else {
                    result = "Old Senior Citizen";
                }

            } else {
                result = age + " is not a valid age";
            }
            System.out.println(result);
    }
 }


/*
Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult (21 ~ 55)
      Senior (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult
 */
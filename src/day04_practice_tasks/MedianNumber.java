package day04_practice_tasks;

public class MedianNumber {


    public static void main(String[] args) {

        int a = 10, b = 15, c = 20;

        boolean aIsMedian = (a > b && a < c)|| (a > c && a < b);
        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);
        int median;

        String result = "is the median number";

        if (aIsMedian) {
            median = a;
        }else if (bIsMedian) {
            median = b;
        } else {
            median = c;
        }

        System.out.println(median + " is the median number");

    }
}




/*
Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
 */
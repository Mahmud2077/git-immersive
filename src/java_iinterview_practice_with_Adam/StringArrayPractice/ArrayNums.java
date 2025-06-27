package java_iinterview_practice_with_Adam.StringArrayPractice;

import java.util.Arrays;

public class ArrayNums {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = -4;
        numbers[1] = -1;
        numbers[2] = -9;
        numbers[3] = -2;
        numbers[4] = -7;


        System.out.println(Arrays.toString(maxmin(numbers)));

    }

    private static int[] maxmin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }


        }

        result[0] = min;
        result[1] = max;
        return result;

    }
}

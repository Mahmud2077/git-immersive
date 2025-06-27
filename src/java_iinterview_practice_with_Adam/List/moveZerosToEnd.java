package java_iinterview_practice_with_Adam.List;

import java.util.Arrays;

public class moveZerosToEnd {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);


    }

    public static void moveZeroes(int[] nums) {

        int [] nums2 = new int[nums.length];

        int index = 0;

        for(int eachNum : nums) {
            if(eachNum != 0) {
                nums2[index++] = eachNum;
            }
        }

        System.out.println(Arrays.toString(nums2));
    }
}

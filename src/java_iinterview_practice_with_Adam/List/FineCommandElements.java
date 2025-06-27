package java_iinterview_practice_with_Adam.List;

import java.util.ArrayList;
import java.util.List;

public class FineCommandElements {

    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = {3, 4, 5, 6};

        System.out.println(findCommonElements(arr1, arr2));

    }
    public static List<Integer> findCommonElements(int[] arr1, int[] arr2) {

        List<Integer>numbers = new ArrayList<>();

        for(int each : arr1) {

            for(int element: arr2) {

                if(each == element) {
                    numbers.add(each);
                }
            }
        }
        return numbers;



    }


}

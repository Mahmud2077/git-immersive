package day15_practice_tasks;

import java.util.*;

public class MergeLists {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));

        Set<Integer> uniqueNums = new LinkedHashSet<>();
        uniqueNums.addAll(list1);
        uniqueNums.addAll(list2);

        System.out.println(uniqueNums);

        List<Integer> uniqueList = new ArrayList<>(uniqueNums);
        System.out.println(uniqueList);


        //Approach 2


        List<Integer>uniqueList2 = new ArrayList<>(list1);

        for(int each : list1) {
            if(!uniqueList2.contains(each)) {
                uniqueList2.add(each);

            }
        }

        for(int each : list2) {
            if(!uniqueList2.contains(each)) {
                uniqueList2.add(each);

            }
        }
        System.out.println(uniqueList2);

    }
}

/*
2. Create a class named MergeLists and write a program that merges two given lists of integers into a third list. Ensure that the third list contains no duplicate elements and maintains the original order of elements from the input lists.

         Example:
            list1 = {10, 20, 30, 40, 50, 60, 70}
            list2 = {30, 40, 50, 60, 70, 80, 90, 100}

         Output:
            list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}

 */
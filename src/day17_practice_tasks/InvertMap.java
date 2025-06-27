package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {

    public static void main(String[] args) {


        Map<Integer, String> original = new HashMap<>();
        original.put(1, "a");
        original.put(2, "b");
        original.put(3, "c");

        Map<String, Integer> inverted = new HashMap<>();

        for (Map.Entry<Integer, String> each : original.entrySet()) {
            inverted.put(each.getValue(), each.getKey());

        }
        System.out.println(inverted);

    }
}

/*
2. Create a class named InvertMap and write a program that returns a new map which is the
inverted version of the provided map, meaning the keys become values and the values become keys.
It is assumed that there are no duplicate values in the original map.

         Example:
               map = {1="a", 2="b", 3="c"}

         Output:
               {"a"=1, "b"=2, "c"=3}
 */
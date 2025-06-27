package java_iinterview_practice_with_Adam.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.addAll(List.of("Dog", "duck", "cat", "Deer"));

        System.out.println(animalList(list, 'd'));

    }

    public static List<String> animalList(List<String> list, char ch) {

        List<String> result = new ArrayList<>();

        for (String eachAnimal : list) {

            if(eachAnimal.toLowerCase().startsWith(ch + "")) {
                result.add(eachAnimal);
            }
        }
        return result;
    }

}

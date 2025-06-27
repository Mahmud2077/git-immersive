package java_iinterview_practice_with_Adam.StringArrayPractice;

public class ArrayTasks {

    public static void main(String[] args) {

        int [] numbers = {1,2,2,3,4,4};

        removeDuplicates(numbers);
    }

    public static int [] removeDuplicates(int[] numbers) {

        String basket="";
        for(int each : numbers){

            if (!basket.contains(each+"")){
                basket+=each;
            }
        }
        System.out.println(basket);
        return numbers;
    }

}

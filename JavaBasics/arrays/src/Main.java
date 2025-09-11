import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        array = a collection of values of the same data type
//        *think of it as a variable that can store more than 1 value*
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        //fruits[0] = "pineapple";
        int numOffFruits = fruits.length;

        System.out.println(fruits[0]);
        System.out.println(numOffFruits);

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        //Enhanced for loop
        System.out.println();
        for (String fruit : fruits){
            System.out.print(fruit + " ");
        }

        //Sorting an array
        System.out.println();
        Arrays.sort(fruits);
        for (String element : fruits){
            System.out.print(element + " ");
        }

        //Fill method with a value
        Arrays.fill(fruits, "pineapple");
        System.out.println();
        for (String value : fruits){
            System.out.print(value + " ");
        }
    }
}

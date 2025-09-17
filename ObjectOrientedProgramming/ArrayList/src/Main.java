import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ArrayList = A resizable array that stores objects(autoboxing)
        //            Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        //fruits.remove(0);
        //fruits.set(0, "Pineapple");

        System.out.println(fruits.get(0));
        System.out.println(fruits.size());
        //Sort the ArrayList
        Collections.sort(fruits);
        for (String element : fruits) {
            System.out.println(element);
        }
        //System.out.println(fruits);
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);
        scanner.close();
    }
}

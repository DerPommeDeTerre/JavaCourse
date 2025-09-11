import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int target = 6;
        //String target2 = "orange";
        String target2;
        boolean isFound = false;

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};

        System.out.print("Enter a fruit to search for: ");
        target2 = scanner.nextLine();

//        Linear Search for NUMBERS
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == target){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element was not found.");
        }
        //        Linear Search for FRUITS
        for (int i = 0; i < fruits.length; i++) {
            if(fruits[i].equals(target2)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element was not found.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //Creating an empty array with 3 values
        //String[] foods = new String[4];
        String[] foods;
        int size;

        System.out.print("What number of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        scanner.close();

        for(String element : foods){
            System.out.print(element + " ");
        }
    }
}

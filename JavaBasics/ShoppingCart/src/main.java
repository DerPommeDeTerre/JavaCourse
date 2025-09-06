import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = ('$');
        double total;

        System.out.print("What item do you want? ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();

        System.out.print("How many do you want? ");
        quantity = scanner.nextInt();

        total = price * quantity;


        System.out.println("You have bought: " + quantity + " " + item + "/s");
        System.out.println("The total is: " + currency + total);


        scanner.close();
    }
}

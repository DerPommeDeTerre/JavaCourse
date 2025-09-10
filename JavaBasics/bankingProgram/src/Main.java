import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //JAVA Banking program for beginners

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            System.out.println("*****Banking Program*****");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*************************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }
        System.out.println();
        System.out.println("Thank you. Have a nice day. :D");
        scanner.close();

//        Declare variables
//        Display menu
//        Get and process users choice
//        showBalance()
//        deposit()
//        withdraw()
//        Exit message
    }
    static void showBalance(double balance){
        System.out.println();
        System.out.printf("Your balance is: $%.2f\n", balance);
        System.out.println();
    }
    static double deposit(){
        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount <= 0){
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }
    static double withdraw(double balance){

        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println();
            System.out.println("Insufficient funds");
            System.out.println();
            return 0;
        } else if (amount < 0) {
            System.out.println();
            System.out.println("Amount can't be negative");
            System.out.println();
            return 0;
        } else {
            return amount;
        }

    }
}

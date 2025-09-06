import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Compound interest calculator
        Scanner scanner =  new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the interest rate [%]: ");
        rate = scanner.nextDouble() / 100;
        scanner.nextLine();

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();
        scanner.nextLine();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is %,.2f", years, amount);

        scanner.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Java Slot machine
        Scanner scanner = new Scanner(System.in);
        //Declare variables
        int balance = 100;
        int bet;
        int payout = 0;
        String[] row;
        String playAgain;
        //Display welcome message
        System.out.println("*************************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ✨");
        System.out.println("*************************");
        //Play If balance > 0
        while (balance > 0){
            System.out.println("Current Balance: $ " + balance);
            //Enter a bet amount
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();
            //Verify if bet > balance
            if(bet > balance){
                System.out.println("Insufficient funds");
                continue;
            } else if(bet <= 0){//Verify if bet > 0
                System.out.println("Bet must be greater than 0");
            } else {
                //Substract bet from balance
                balance = balance - bet;
                System.out.println("$" + balance);
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0){
                System.out.println("You won: $ " + payout);
                balance = balance + payout;
            } else {
                System.out.println("Sorry, you lost this round.");
            }
            //Ask to play again
            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")){
                break;
            }
        }
        //Display exit message
        System.out.println("Game over. Your final balance is: $ " + balance);
        scanner.close();
    }
    //Spin row
    static String[] spinRow(){

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "✨"};
        String[] row = new String[3];
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[rand.nextInt(symbols.length)];
        }
        return row;
    }
    //Print row
    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
    //Get payout
    static int getPayout(String[] row, int bet){
        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "✨" -> bet * 20;
                default -> 0;
            };
        } else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "✨" -> bet * 10;
                default -> 0;
            };
        } else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "✨" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}

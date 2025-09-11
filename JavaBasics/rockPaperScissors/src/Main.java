import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Rock Paper Scissors Game
        //Declare variables
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            //Get choice from the user
            System.out.print("Enter your choice: ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors") ){
                System.out.println("Invalid choice");
                continue;
            }
            //Get random choice for the computer
            computerChoice = choices[rand.nextInt(3)];
            System.out.println(computerChoice);
            //Check win conditions
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie");
            } else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))){
                System.out.println("You win!");
            } else {
                System.out.println("You lose");
            }
            //Ask to play again
            System.out.print("Play again? [yes/no]: ");
            playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));
        //Goodbye message
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

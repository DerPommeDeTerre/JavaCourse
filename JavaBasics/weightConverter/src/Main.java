import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Weight conversion program
//        Declare variables
//        welcome message
//        prompt for use choice
//        option 1: convert lbs to kg
//        option 2: convert kgs to lbs
//        else print not valid choice

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;
            System.out.printf("The weigh in kgs is: %.2f", newWeight);
        } else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;
            System.out.printf("The weigh in lbs is: %.2f", newWeight);
        } else {
            System.out.println("That was bot a valid choice");
        }

        scanner.close();
    }
}

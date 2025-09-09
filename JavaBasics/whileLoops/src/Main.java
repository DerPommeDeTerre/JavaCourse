import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        while loop = repeat some code forever
//                     while some condition remains true
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do{
            System.out.print("Enter a number between 1 to 10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.print("You entered: " + number);
//        ----------DO WHILE-------------
//        int age = 0;
//
//        System.out.print("Enter your age: ");
//        age = scanner.nextInt();
//
//        do{
//            System.out.println("Your age cann't be negative");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//        }while(age < 0);
//
//        System.out.println("Your age is " + age);
//        ------------Name E.G.------------------------
//        String name = "";
//        while(name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);
//        ----------Special Character Example-----------
//        String response = "";
//        while(!response.equals("Q")){
//            System.out.println("Playing a game");
//            System.out.print("Press Q to quit: ");
//            response = scanner.nextLine().toUpperCase();
//        }
//
//        System.out.println("You have quit the game");

        scanner.close();
    }
}

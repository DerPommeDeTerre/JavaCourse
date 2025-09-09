import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        && = AND
//        || = OR
//        ! = NOT
//        ---------User E.G.------------
        String username;
        Scanner scanner = new Scanner(System.in);

//        username must be between 4-12 characters
//        username must not contain spaces or underscores
        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        } else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores.");
        }
        else {
            System.out.println("Welcome: " + username);
        }

        scanner.close();
//        ---------Weather E.G.----------
//        double temp = -10;
//        boolean isSunny = true;
//
//        if(temp <= 30 && temp >= 0 && isSunny){
//            System.out.println("The weather is good.😉");
//            System.out.println("It is sunny outside.");
//        } else if(temp <= 30 && temp >= 0 && !isSunny){
//            System.out.println("The weather is good.😉");
//            System.out.println("It is CLOUDY.");
//        } else if(temp > 30 || temp < 0){
//            System.out.println("The weather is bad.");
//        }
    }
}

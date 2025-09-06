import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        IF statements perform a block of code if its condition is true
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Are you a Student? (true/false): ");
        isStudent = scanner.nextBoolean();
//        GROUP 1
        if(name.isEmpty()){
            System.out.println("Enter your name");
        } else {
            System.out.println("Hello " + name);
        }
//        GROUP 2
        if(age >= 65){
            System.out.println("You are a Senior");
        }
        else if(age >= 18){
            System.out.println("You are an Adult");
        }
        else if(age <0){
            System.out.println("You have not been born yet");
        } else if(age == 0){
            System.out.println("You are a baby");
        }
        else {
            System.out.println("You're not an adult");
        }

//        GROUP 3
        if(isStudent){
            System.out.println("You are a Student");
        } else {
            System.out.println("You are Not a Student");
        }
        
        scanner.close();
    }
}

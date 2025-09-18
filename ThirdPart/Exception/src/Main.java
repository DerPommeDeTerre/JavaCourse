import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Exception = An event that interrupts the normal flow of a program
        //            (Dividing by zero, file not found, mismatch input type)
        //            Sorround any dangerous code with a try{} block
        //            try{}, catch{}, finally{}

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
        }  catch(InputMismatchException e) {
            System.out.println("That wasn't a number");
        } catch (Exception e){
            System.out.println("Something went wrong");
        } finally {
            scanner.close();
            System.out.println("This always executes");
        }
//       Try with resources
//        try(Scanner scan = new Scanner(System.in);){
//            System.out.print("Enter a number: ");
//            int numbers = scan.nextInt();
//        }  catch(InputMismatchException e) {
//            System.out.println("That wasn't a number");
//        } catch (Exception e){
//            System.out.println("Something went wrong");
//        } finally {
//            System.out.println("This always executes");
//        }

//        try{
//            System.out.println(1 / 0);
//        } catch (ArithmeticException e) {
//            System.out.println("You can't divide by zero");
//        }


    }
}

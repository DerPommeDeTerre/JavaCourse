import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();

//        Random INT numbers

//        int number1;
//        int number2;
//        int number3;
//
//        number1 = random.nextInt(1,101); //INCLUSIVE, EXCLUSIVE [1,6]
//        number2 = random.nextInt(1,101); //INCLUSIVE, EXCLUSIVE [1,6]
//        number3 = random.nextInt(1,101); //INCLUSIVE, EXCLUSIVE [1,6]
//
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);

//        Random DOUBLE numbers
//        double number;
//
//        number = random.nextDouble();
//
//        System.out.println(number);

//        Random BOOLEAN numbers
        boolean number;

        number = random.nextBoolean();

        if(number){
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds you count down from?: ");
        int start = scanner.nextInt();

        scanner.close();
//        ----------Countdown E.G.------------
        for (int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new Year :D");

        //for loop = execute some code a certain amount of times
//        for(int i= 0;i <= 10 ; i+=2) {
//            System.out.println(i);
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter how many times you want to loop: ");
//
//        int max = scanner.nextInt();
//
//        for(int i = 1; i <= max; i++){
//            System.out.println(i);
//        }
//
//        scanner.close();
    }
}

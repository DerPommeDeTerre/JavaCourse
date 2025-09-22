import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        //Countdown timer program

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of second to count down from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int counter = response;

            @Override
            public void run(){
                System.out.println(counter);
                counter--;
                if(counter < 0){
                    System.out.println("Happy new Year");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task,0, 1000);//(task, delay, period)

        scanner.close();
    }
}

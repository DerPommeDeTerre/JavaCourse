import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Object = An entity that holds data (attributes)
        //         and can perform actions (methods)
        //         It is a reference data type

        //Scanner scanner = new Scanner(System.in);
        //Random rand = new Random();

        Car car = new Car();

        //car.isRunning = true;

        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);


        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();
        //SECOND OBJECT
        Car car2 = new Car();

        System.out.println(car.make + " " + car.model);
        System.out.println(car2.make + " " + car2.model);
    }
}

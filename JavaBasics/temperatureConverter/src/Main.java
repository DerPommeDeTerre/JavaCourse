import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to Celsius or Fahrenheit? [C/F]: ");
        unit = scanner.next().toUpperCase(); //Single character

//      Ternary operator:  (condition) ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("The new temperature is: %.2f°%s" , newTemp, unit); //BLOCK NUM + ALT + 0176

        scanner.close();
    }
}

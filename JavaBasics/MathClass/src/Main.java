import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//
//        double result;
//
//        result = Math.pow(2, 4);
//        result = Math.abs(-5);
//        result = Math.sqrt(9);
//        result = Math.round(3.14);
//        result = Math.ceil(3.14); //Round up to the ceiling
//        result = Math.floor(3.99); //Round down
//        result = Math.max(10, 20);
//        result = Math.min(10, 20);
//
//        System.out.println(result);

//        HYPOTENUSE c = Math.sqrt(a^2 + b^2)
//        Scanner scanner = new Scanner(System.in);
//
//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter the value of A: ");
//        a = scanner.nextDouble();
//        scanner.nextLine();
//
//        System.out.print("Enter the value of B: ");
//        b = scanner.nextDouble();
//        scanner.nextLine();
//
//     Calculation
//        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//
//        System.out.println("The hypotenuse is: " + c);
//        scanner.close();

//        Circumference = 2 * Math.PI * radius;
//        area = Math.PI * Math.pow(radius, 2);
//        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;


        System.out.print("Enter the circle radius: ");
        radius = scanner.nextDouble();
        scanner.nextLine();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

//        Set DECIMALS
        System.out.printf("The circumference is: %.1f\n", circumference);
        System.out.printf("The area is: %.1f\n", area); //BLOCK NUM + ALT + 0178 ²
        System.out.printf("The volume is: %.1f\n", volume); //BLOCK NUM + ALT + 0179 ³

        scanner.close();

    }
}

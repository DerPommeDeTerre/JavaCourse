import java.util.Scanner; //Import SCANNER object

public class Main {
    public static void main(String[] args){
        //This is my first Java program
        /*
        This is a
        multiline comment
        */
//        System.out.print("I like potatoes\n");
//        System.out.print("They are really good\n");
//        System.out.print("Buy some potatoes, mister\n");
//        System.out.println("Oh yeah, SOUT, buddy");
        //--------------Variables in JAVA--------------
//        int age = 30;
//        int year = 2025;
//        int quantity = 1;
//
//        double price = 19.99;
//        double gpa = 3.5;
//        double temperature = -12.5;
//
//        char grade = 'A';
//        char symbol = '!';
//        char currency = '$';
//
//        boolean isStudent = false;
//        boolean forSale = false;
//        boolean isOnline = true;
//
//        System.out.println(age);
//        System.out.println(year);
//        System.out.println(quantity);
//
//        System.out.println("The year is " + year);
//
//        System.out.println("$ " + price);
//        System.out.println(gpa);
//        System.out.println(temperature);
//
//        System.out.println(grade);
//        System.out.println(symbol);
//        System.out.println(currency);
//
//        System.out.println(isStudent);
//        System.out.println(forSale);
//        System.out.println(isOnline);
//
//        if(isStudent){
//            System.out.println("You are a Student");
//        } else {
//            System.out.println("You are not a Student");
//        }
//        String name = "My Name";
//        String food = "Portobello";
//        String email = "fake@mail.com";
//        String car = "Mustang";
//        String color = "purple";
//
//        System.out.println("Hello " + name);
//        System.out.println("Your favorite food is " + food);
//        System.out.println("Your email is: " + email);
//        System.out.println(car);
//        System.out.println(color);
//
//        System.out.println("Your choice is a: " + color
//        + " " + year + " " + car);
//
//        if(forSale){
//            System.out.println("There is a " + car + " for sale");
//        } else {
//            System.out.println("There is not a " + car + " for sale");
//        }

//        --------------User INPUT------------
//        Scanner scanner = new Scanner(System.in); //CLASS object
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine(); //Reads a STRING of characters, including spaces
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("Enter your weight: ");
//        double weight = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean student = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("Your age is: " + age);
//        System.out.println("Your weight is: " + weight);
//        System.out.println("You are a student?: " + student);
//
//        if(student){
//            System.out.println("You are enrolled as a student");
//        } else {
//            System.out.println("You are not enrolled as a student");
//        }

        //COMMON ISSUES
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine(); //Get rid of the new line character
//
//        System.out.print("Enter your favorite color: ");
//        String color = scanner.nextLine();
//
//        System.out.println("You are " + age + " years old");
//        System.out.println("You like the color " + color);
//
//
//        scanner.close();

//        ----------Calculate a rectangle area-------------
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();
        scanner.nextLine();

        area = width * height;

        System.out.println("The area is: " + area + " cm²"); //BLOQ NUM + ALT + 0178


        scanner.close(); //Clos the scanner
    }
}

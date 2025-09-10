
public class Main {
    public static void main(String[] args){
//        method = a block of reusable code that is executed when called()

        String name = "Mau";
        int age = 25;

        happyBirthday(name, age);
//        Square method
        double result = square(3);
        System.out.print("The result is: " + result);
//        Cube method
        double resultCube = cube(3);
        System.out.println("\nResult cube is: " + resultCube);

        String fullName = getFullName("Mau", "Pau");
        System.out.println("The full name is: " + fullName);

        int age2 = 25;
        if(ageCheck(age2)){
            System.out.println("You may sign up");
        } else {
            System.out.println("You must be +18 to sign up");
        }
    }
//    As the main is static, the method is static
//    Methods are not familiar with variables in other methods
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you");
        System.out.printf("Happy Birthday dear %s\n", name);
        System.out.println("Happy Birthday to you");
        System.out.printf("You are %d years old\n", age);
    }
//    We have to specify the datatype of what we are returning
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        } else {
            return false;
        }
    }
}

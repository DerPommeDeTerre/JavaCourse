import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        //ternary operator ? = Return 1 of 2 values if a condition is true
        //variable = (condition) ? ifTrue : ifFalse;
//        -------------------SCORES-------------------
//        int score = 70;
//
//        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
//        System.out.println(passOrFail);

//        if(score >= 60){
//            System.out.println("PASS");
//        } else {
//            System.out.println("FAIL");
//        }
//        --------------------EVEN/ODD------------------
//        int number = 4;
//
//        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
//        System.out.println(evenOrOdd);
//        --------------------TIME----------------------
//        int hours = 13;
//
//        String timeOfDay = (hours <= 12) ? "AM" : "PM";
//        System.out.println(timeOfDay);
//        ---------------------INCOME--------------------
        int income = 60000;

        double taxRate = (income >= 40000)  ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}

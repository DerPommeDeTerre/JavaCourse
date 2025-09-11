public class Main {
    public static void main(String[] args){
        //varargs = allow a method to accept a varying # of arguments
        //          makes methods more flexible, no need for overloaded methods
        //          java will pack the arguments into an array
        //          ... (ellipsis)
        System.out.println("Sum: " + add(1,2,3,4));
        System.out.println("Average: " + average(1,2,3,4));
    }
    static int add(int... numbers){
        int sum = 0;

        if(numbers.length == 0 ){
            return 0;
        }

        for(int element : numbers){
            sum = sum + element;
        }
        return  sum;
    }
    static double average(double...digits){
        double sum = 0;

        if(digits.length == 0 ){
            return 0;
        }

        for (double element : digits){
            sum = sum + element;
        }
        return sum/ digits.length;
    }
}

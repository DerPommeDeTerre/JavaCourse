public class Main {
    public static void main(String[] args){
//        printf() is a method used to format output
//        %[flags][width][.precision][specifier-character]

        String name = "Spongebob"; // %s
        char firstLetter = 'S'; // %c
        int age = 30; // %d
        double height = 60.5; // %f
        boolean isEmployed = true; // %b

        System.out.printf("Hello %s\n", name);
        System.out.printf("Hello %c\n", firstLetter);
        System.out.printf("You are %d years old \n", age);
        System.out.printf("You are %f inches tall \n", height);
        System.out.printf("Employed: %b \n", isEmployed);

        System.out.printf("\n%s is %d years old\n\n", name, age);

        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54.01;
        double price4 = -54.01;
        double price5 = 89.01;

        //        [flags]
        //        + = output a plus
        //        , = comma grouping separator
        //        ( = negative numbers are enclosed in ()
        //        space = display a minus if negative, space is positive

        System.out.printf("%+.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.2f\n", price3);
        System.out.printf("% .2f\n", price4);
        System.out.printf("% .2f\n\n", price5);

        //        [width]
        //        0 = zero padding 04 - number of digits
        //        number = right justified padding SPACES
        //        negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%04d\n", id4);



    }
}

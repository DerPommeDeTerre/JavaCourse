public class Main {
    public static void main(String[] args){
        //Wrapper classes = Allows primitive values (int, char, double, boolean)
        //                  to be used ad objects. "Wrap them in an object"
        //                  Generally, don't wrap primitive unless you need and object.
        //                  Allows use of Collections Framework and static utility methods.
      //Integer a = new Integer(123);
      //Double b = new Double(3.14);
      //Character c = new Character('$');
      //Boolean d = new Boolean(true);

      //Autoboxing
//        Integer a = 123;
//        Double b = 3.14;
//        Character c = '$';
//        Boolean d = true;
//        String e = "Pizza";
//      //Unboxing
//        int x = a;
//        double y = b;
//        char z = c;
//        boolean xy = d;

//        String a = Integer.toString(123);
//        String b = Double.toString(3.14);
//        String c = Character.toString('@');
//        String d = Boolean.toString(false);
//
//        String x = a + b + c + d;
//
//        System.out.println(x);

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}

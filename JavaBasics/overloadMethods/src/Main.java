
public class Main {
    public static void main(String[] args){
//        overload methods = methods that share the same name
//                            but different parameters
//               signature = name + parameters

//        System.out.println(add(1,2,3,4));
        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza);
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String toping){
        return toping + " " +  cheese + " " + bread + " pizza";
    }
//    static double add(int a, int b){
//        return a + b;
//    }
//    static double add(int a, int b, int c){
//        return a + b + c;
//    }
//    static double add(int a, int b, int c, int d){
//        return a + b + c + d;
//    }
}

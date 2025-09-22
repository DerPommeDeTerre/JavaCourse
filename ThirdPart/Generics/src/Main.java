import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Generics = A concept where you can write a class, interface, or method
        //           that is compatible with different data types.
        //           <T> type parameter (placeholder that gets replaced with a real type)
        //           <String> type argument (specifies the type)

        Box<String> box = new Box<>();
        Box<Integer> box1 = new Box<>();
        Box<Double> box2 = new Box<>();

        box.setItem("Banana");
        box1.setItem(25);
        box2.setItem(3.14);

        System.out.println(box.getItem());
        System.out.println(box1.getItem());
        System.out.println(box2.getItem());

        System.out.println();

        Product<String, Double> product = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("ticket", 15);

        System.out.println(product.getItem() + " " + product.getPrice());
        System.out.println(product2.getItem() + " " + product2.getPrice());
    }
}

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        //HashMap = A data structure that stores key-value pairs
        //          Keys are unique, but Values can be duplicated
        //          Does not maintain any order, but is memory efficient
        //          HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

        //map.remove("apple");

        //duplicated keys overwrite the value

        System.out.println(map);

        System.out.println(map.get("apple"));

        System.out.println(map.containsKey("pineapple"));

        System.out.println();

        if (map.containsKey(("apple"))){
            System.out.println(map.get("apple"));
        } else {
            System.out.println("Key not found");
        }

        System.out.println();

        System.out.println(map.containsValue(1.00));

        System.out.println(map.size());

        System.out.println();

        for(String element : map.keySet()){
            System.out.println(element + " : $" + map.get(element));
        }
        //get, gets the value
        //ketSet() returns the keys in the map

    }
}

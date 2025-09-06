
public class Main {
    public static void main(String[] args){

        String name = "Password";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("a");
        int lastIndex = name.lastIndexOf("e");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        name = name.trim();
        name = name.replace("e", "a");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(name.isEmpty());

        if(name.isEmpty()){
            System.out.println("Your name is empty");
        } else {
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        } else {
            System.out.println("Your name doesn't contain any spaces");
        }

        if(name.equalsIgnoreCase("password")){ //This method doesn't account for case sensitivity
            //but we can use equalsIgnoreCase for ignoring cases
            System.out.println("Your name can't be password");
        } else {
            System.out.println("Hello: " + name);
        }


    }
}

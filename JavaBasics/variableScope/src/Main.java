
public class Main {

    static int x = 3; //Class scope

    public static void main(String[] args){

        int x = 1; //Local variable
        System.out.println(x);
        doSomething();
    }
    static void doSomething(){
        int x = 2; //Local variable
        System.out.println(x);
    }
}

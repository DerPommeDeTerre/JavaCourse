
public class Automobile {
    String model;
    String color;

    Automobile(String color, String model){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You are driving the " + this.color + " " + this.model);
    }
}

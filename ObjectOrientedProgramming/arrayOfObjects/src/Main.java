public class Main {
    public static void main(String[] args){

        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        //CAR OBJECTS[] NAME = NEW DATATYPE[SIZE]
        //Car[] cars = new Car[3];
        Car[] cars = {car1, car2, car3};

        for(Car car : cars){
            car.drive();
        }
        System.out.println();
        //Anonymous objects
        //They don't have an unique identifier
        Automobile[] automobiles = {new Automobile("Green", "Jeep"),
                                    new Automobile("Black", "DeLorean"),
                                    new Automobile("Yellow", "Beetle")};
        for (Automobile auto : automobiles){
            auto.color = "black";
        }
        for(Automobile auto : automobiles){
            auto.drive();
        }
    }
}

public class Main {
    public static void main(String[] args){
        //Polymorphism = POLY = MANY
        //               MORPH = SHAPE
        //               Objects can identify as other objects
        //               Objects can treated as objects of common superclass

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        System.out.println();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle element : vehicles){
            element.go();
        }

        voiture Voiture = new voiture();
        Velo velo = new Velo();
        bateau Bateu = new bateau();

        Vehicule[] vehicule = {Voiture, velo, Bateu};

        for(Vehicule partie : vehicule){
            partie.go();
        }
    }
}

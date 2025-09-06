
public class Suma {
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int resultado = sumar(2, 4, 6);
        System.out.println("La suma de los tres números es: " + resultado);
    }
}
public class Coche {
    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void agregarPuerta() {
        this.numPuertas++;
    }

    public int getNumPuertas() {
        return this.numPuertas;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche(3);
        miCoche.agregarPuerta();
        System.out.println("El número de puertas de mi coche es: " + miCoche.getNumPuertas());
    }
}
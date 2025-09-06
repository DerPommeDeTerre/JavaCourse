public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        var valor  = suma (a,b,c);
        System.out.println(valor);

        Coche miCoche= new Coche();
        miCoche.AnadirPuerta();
        miCoche.AnadirPuerta();
        miCoche.AnadirPuerta();
        miCoche.AnadirPuerta();
        System.out.println(miCoche.puertas);
    }
    public static int suma (int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 0;

    public void AnadirPuerta() {
        this.puertas++;
    }
}
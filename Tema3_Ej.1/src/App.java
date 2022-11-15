public class App {
    public static void main(String[] args) throws Exception {
        // 1ªPARTE
        suma(15, 15, 15);
        // 2ªPARTE
        Coche miCoche = new Coche();
        miCoche.AddPuerta();
        System.out.println("Mi coche tiene: "+miCoche.puertas+ " puerta/s");

    }

    public static void suma(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println("El resultado de la suma es: " + resultado);
    }
}

class Coche {
    public int puertas = 0;

    public void AddPuerta() {
        this.puertas++;
    }
    
}

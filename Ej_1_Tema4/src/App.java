public class App {
    public static void main(String[] args) throws Exception {

        // EJERCICIO IF↓↓

        int numeroIf = 3;
        if (numeroIf > 0) {
            System.out.println("numeroIf es un numero positivo");
        } else if (numeroIf < 0) {
            System.out.println("numero if es un numero negativo");
        } else {
            System.out.println("numero if es el número 0");
        }
        System.out.println("--------------");

        // EJERCICIO WHILE↓↓

        int numWhile = 0;
        while (numWhile < 3) {
            System.out.println("While " + numWhile);
            numWhile++;
        }
        System.out.println("-------------");

        // EJERCICIO DO WHILE↓↓

        int num_Do_While = 0;
        do {
            System.out.println("Do_While " + num_Do_While);
        } while (numWhile == 0);
        System.out.println("---------------");

        // EJERCICIO FOR↓↓
       
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("FOR " + numeroFor);
        }
        System.out.println("-------------");
        
        //EJERCICIO CASE↓↓

        String estacion = "noviembre";
        switch (estacion) {
            case ("marzo"):
            case ("abril"):
            case ("mayo"):
            case ("junio"):
                System.out.println("Es primavera");
                break;
            case ("julio"):
            case ("agosto"):
                System.out.println("Es verano");
                break;
            case ("septiembre"):
            case ("octubre"):
            case ("noviembre"):
                System.out.println("Es otoño");
                break;
            case ("diciembre"):
            case ("enero"):
            case ("febrero"):
                System.out.println("Es invierno");
                break;
            default:
            System.out.println("No es ninguna estación");


        }

    }
}

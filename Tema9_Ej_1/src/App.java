public class App {
    public static void main(String[] args) throws Exception {
        cliente cliente1 = new cliente();
        cliente1.setEdad(33);
        cliente1.setNombre("Rosa");
        cliente1.setTelefono(3333333);
        cliente1.setCredito(1500.33);
        
        System.out.println("Cliente: " + cliente1.getNombre() + "\nEdad: " + cliente1.getEdad() + "\nTeléfono: "
                + cliente1.getTelefono() + "\nCrédito " + cliente1.getCredito());
        System.out.println("--------");

        trabajador trabajador1 = new trabajador();
        trabajador1.setEdad(27);
        trabajador1.setNombre("Joel");
        trabajador1.setTelefono(5555555);
        trabajador1.setSalario(3333.25);

        System.out.println("Trabajador: " + trabajador1.getNombre() + "\nEdad: " + trabajador1.getEdad() + "\nTeléfono: "
                + trabajador1.getTelefono()+ "\nSalario: "+trabajador1.getSalario());
        
        
    }
}

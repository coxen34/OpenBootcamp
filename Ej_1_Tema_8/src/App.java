public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.setEdad(30);
        persona1.setNombre("Albert");
        persona1.setTelefono(333003300);

        System.out.println("La persona1 tiene: "+persona1.getEdad()+" años. Se llama "+persona1.getNombre()+" y su telefono es: "+persona1.getTelefono());
        
    }
}

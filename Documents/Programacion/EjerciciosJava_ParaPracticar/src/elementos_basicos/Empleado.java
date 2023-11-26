
package elementos_basicos;


public class Empleado extends Persona{
    
    // Atributos
    private int sueldo;

    // Constructor
    public Empleado(int sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }
    
    // Metodos

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void comer() {
        System.out.println("Soy " + getNombre() + " y estoy comiendo");
    }
    
    
    
    
    
}

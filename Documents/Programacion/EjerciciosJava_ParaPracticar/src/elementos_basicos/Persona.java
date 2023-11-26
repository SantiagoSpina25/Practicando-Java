
package elementos_basicos;


public class Persona {
    
    // Atributos
    private String nombre;
    private int edad;
    
    
    //Constructor
    public Persona(){
    }
    
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    // Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void comer(){
        System.out.println("Comiendo...");
    }
    
    
    
    
}

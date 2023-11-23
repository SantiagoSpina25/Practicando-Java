
package ejercicio.motel;


public class Huesped {
    //Atributos
    private String nombre;
    private int noches;
    private int precio;
    
    // Constructores
    public Huesped(String nombre, int noches){
        this.nombre = nombre;
        this.noches = noches;
        precio = noches * 50;
    }
    
    
    // Metodos

    public String getNombre() {
        return nombre;
    }

    public int getNoches() {
        return noches;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Huesped{" + "nombre=" + nombre + ", noches=" + noches + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

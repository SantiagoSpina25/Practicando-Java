
package ejerciciohoteles;


public abstract class Hotel {
    
    // Atributos
    protected String nombre;
    protected int precio;
    protected boolean comprado = false;
    
    // Constructor
    public Hotel(){}
    
    // Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio <= 0){
            this.precio = 0;
        }
        else{
            this.precio = precio;
        }

    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    @Override
    public String toString() {
        char compra;
        if(comprado){
            compra = 'x';
        }
        else{
            compra = ' ';
        }
        
        return nombre + "[" + compra + "]";
    }
    
    
    
    
}

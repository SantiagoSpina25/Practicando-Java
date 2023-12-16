
package ejerciciohoteles;


public class Jugador {
    
    //Atributos
    private String nombre;
    private int dinero;
    
    //Constructores
    public Jugador(){
        nombre = "noname";
        dinero = 25000000;
    }
    
    public Jugador(String nombre){
        this.nombre = nombre;
        dinero = 25000000;
    }
    
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", dinero=" + dinero + '}';
    }
    
    
}

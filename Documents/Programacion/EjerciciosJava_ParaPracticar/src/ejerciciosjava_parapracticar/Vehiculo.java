package ejerciciosjava_parapracticar;


public class Vehiculo {
    // Atributos
    private String marca;
    private String modelo;
    private int precio;
    
    // Constructores
    
    public Vehiculo(){
   
    }
    
    
    public Vehiculo(String marca, String modelo, int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    // Metodos
    
    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // toString
    @Override
    public String toString() {
        return "Coche: {" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }
    
    
    
    
    
}

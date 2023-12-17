
package ejerciciogoldenaxe;


public class Jugador {
    
    //Atributos
    protected int vida;
    protected int fuerza;
    protected boolean vivo;
    protected String nombre;
    protected Carta [] cartas = new Carta [5];
    
    //Constructor

    public Jugador() {
        cartas[0] = new Carta("Obtienes un punto de vida", 1, 0);
        cartas[1] = new Carta("Te quitan un punto de vida", -1, 0);
        cartas[2] = new Carta("Obtienes un punto de fuerza", 0, 1);
        cartas[3] = new Carta("Te quitan un punto de fuerza", 0  , -1);
        cartas[4] = new Carta("Obtienes dos puntos de vida", 2, 0);
    }
    
    //Metodos

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public boolean isVivo() {
        if(vida > 0){
            vivo = true;
        }
        else{
            vivo = false;
        }
        
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carta getCarta(int numCarta) {
        return cartas[numCarta];
    }

    public void setCarta(Carta[] carta) {
        this.cartas = carta;
    }
    
    
    
}

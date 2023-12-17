
package ejerciciogoldenaxe;


public class Cthulhu {
    
    //Atributos
    
    protected int vida;
    protected int fuerza;
    protected boolean vivo;
    
    //Constructor
    
    public Cthulhu(int numJugadores){
        fuerza = 1;
        vida = 20 + (numJugadores * 2);
    }
    
    //Metodos

    public int getVida() {
        if(vida < 0){
            vida = 0;
        }
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
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    
}

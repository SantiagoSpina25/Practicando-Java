
package ej.pkg7.trimestre.pkg2.sdla;


public class Orco {
    private int vida;
    private int ataque;
    
    
    public Orco(){
        vida = 100;
        ataque = 2;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    
    
    
    @Override
    public String toString() {
        return "Orco{" + "vida=" + vida + '}';
    }
    
    
    
    
    
    
    
    
    
}

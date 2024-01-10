
package ej.pkg7.trimestre.pkg2.sdla;


public class Carta {
    //Atributos
    private int ataque;
    private int vida;
    
    
    //Constructor
    public Carta(int ataque, int vida){
        this.ataque = ataque;
        this.vida = vida;
    }
    
    //Metodos

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Carta{" + "ataque=" + ataque + ", vida=" + vida + '}';
    }
    
    
   
}

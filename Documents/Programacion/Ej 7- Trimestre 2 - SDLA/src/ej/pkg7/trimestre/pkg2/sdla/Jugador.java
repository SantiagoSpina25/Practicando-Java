
package ej.pkg7.trimestre.pkg2.sdla;

import java.util.Arrays;


public abstract class Jugador {
    //Atributos
    protected String nombre;
    protected int vida;
    protected int ataque;
    protected boolean vivo;
    protected Carta [] cartas;
    
    //Constructor
    public Jugador(){
        vivo = true;
        cartas = new Carta [100];
    }
    
    //Metodos
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

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }
    
    public void robarCarta(Carta carta){
        for (int i = 0; i < cartas.length; i++) {
            if(cartas[i]==null){
                cartas[i]=carta;
                break;
            }
            
        }
        
    }
    
    public void verCartas(){
        for (int i = 0; i < cartas.length; i++) {
            if(cartas[i] != null){
                System.out.println(cartas[i] + " pos:" + i);    
            }
        }
    }
    
    public void usarCarta(int posCarta){
            vida += cartas[posCarta].getVida();
            ataque += cartas[posCarta].getAtaque();
            
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    @Override
    public String toString() {
        return "Jugador{" + "vida=" + vida + ", ataque=" + ataque + ", vivo=" + vivo;
    }
    
    
    
}

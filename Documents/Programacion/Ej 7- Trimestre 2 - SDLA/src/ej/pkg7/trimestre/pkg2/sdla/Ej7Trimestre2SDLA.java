
package ej.pkg7.trimestre.pkg2.sdla;
import java.util.Scanner;

public class Ej7Trimestre2SDLA {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Aragon aragon = new Aragon();
        Legolas legolas = new Legolas();
        Gimli gimli = new Gimli();
        Orco orco = new Orco();
        
        Jugador [] jugadores = {aragon, legolas, gimli};
        
        Carta [] mazo = new Carta[10];
        for (int i = 0; i < mazo.length; i++) {
            int ataque = (int) (Math.random() *10);
            int vida = (int) (Math.random() *10);
            
            mazo[i] = new Carta(ataque,vida);
        }
        
        
        do {            
            
            //Bucle para cada turno de cada jugador
            for (int i = 0; i < jugadores.length; i++) {
                
                System.out.println(jugadores[i].getNombre() + " roba carta...");
                //Roba una carta random
                int cartaRandom = (int) (Math.random() *10 );
                
                jugadores[i].robarCarta(mazo[cartaRandom]);
                
                //Mostramos la cartas
                jugadores[i].verCartas();
                
                System.out.println("Que quieres hacer? 1.Usar carta o 2.Cagarse a palos");
                int eleccion = sc.nextInt();
                
                switch (eleccion) {
                    case 1:
                        System.out.println("Cartas:");
                        //Mostramos la cartas
                        jugadores[i].verCartas();
                        
                        
                        System.out.println("Indica posicion de la carta que quieres jugar");
                        
                        int posCarta = sc.nextInt();
                        
                        jugadores[i].usarCarta(posCarta);
                        System.out.println(jugadores[i].getNombre() + " ha usado una carta");
                        System.out.println("Estadisticas: "+jugadores[i]);
                        break;
                    case 2:
                        int daño = jugadores[i].getAtaque();
                        orco.setVida(orco.getVida()-daño);
                        
                        System.out.println("Sacaste " + daño + " puntos de vida");
                        break;
                        
                    default:
                        System.out.println("El numero no esta entre el 1 y el 2");
                }
            }
            
            
            //Ataque orco
                int rand = (int) (Math.random() * 3);
                jugadores[rand].setVida(jugadores[rand].getVida() - orco.getAtaque());
                
                System.out.println("Vida restante del orco: " + orco.getVida());
            
            
            
        } while (orco.getVida() > 0 && jugadoresVivos(jugadores));
        
        
        
        
    }

    private static boolean jugadoresVivos(Jugador jugadores []) {
        boolean vivos = true;
        for (int i = 0; i < jugadores.length; i++) {
            if(!(jugadores[i].isVivo())){
                vivos = false;
            }
        }
        return vivos;
    }
    
    
    
}

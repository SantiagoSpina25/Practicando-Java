
package ejerciciogoldenaxe;

import java.util.Scanner;


public class EjercicioGoldenAxe {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------GOLDEN AXE---------------------------------");
        
        System.out.println("ELIGE EL NUMERO DE JUGADORES DEL 1 AL 5");
        int numJugadores = sc.nextInt();
        
        //Cantidad de turnos
        int limiteTurnos = 8 - numJugadores;
        int turnos = 0;
        
        //Creamos un array para almacenar los jugadores
        Jugador [] jugadores = new Jugador [numJugadores];
        
        //Creamos a Cthulhu
        Cthulhu cthulhu = new Cthulhu(numJugadores);
        
        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Elija jugador: 1. ENANO, 2. GUERRERO O 3. AMAZONA");
            int opcionJugador = sc.nextInt();
            switch (opcionJugador) {
                case 1://Enano
                    jugadores[i] = new Enano();
                    break;
                case 2://Guerrero
                    jugadores[i] = new Guerrero();
                    break;
                case 3://Amazona
                    jugadores[i] = new Amazona();
                    break;
                default:
                    System.out.println("El numero no esta entre el 1 y el 3, introduzca un jugador nuevamente");
                    i--;
            }
        }
            //Comienzo del juego
            System.out.println("---------------------------------COMIENZA EL JUEGO---------------------------------");
            do {                
                
                System.out.println("TURNO: " + turnos);
                
                System.out.println("");
                
                
                //Recorremos el array para interactuar con cada jugador
                for (int j = 0; j < jugadores.length; j++) {
                    System.out.print("Jugador: " + jugadores[j].getNombre() + " (jugador n" + (j+1) + ")");
                    System.out.println(" Elige que quieres hacer en tu turno... 1.Luchar con Cthulhu, 2.Coger una carta o 3.Descansar");
                    
                    int accionJugador = sc.nextInt();
                    
                    switch (accionJugador) {
                        case 1://Luchar con cthulhu
                            lucharCthulhu(jugadores[j], cthulhu);
                            break;
                        case 2://Coger una carta
                            cogerCarta(jugadores[j]);
                            break;
                        case 3://Descansar 
                            reponerVida(jugadores[j]);
                            break;
                        default:
                            System.out.println("El numero no esta entre el 1 y el 3");
                    }
                    
                    if(cthulhu.getVida() < 0){
                        break;
                    }
                    else if(!jugadoresVivos(jugadores)){
                        break;
                    }
                    
                }
                System.out.println("");
                System.out.println("Turnos restantes: " + (limiteTurnos - turnos));
                turnos++;
                
                
            } while ((turnos != limiteTurnos) && (cthulhu.getVida() > 0) && jugadoresVivos(jugadores));
            
            if(cthulhu.getVida() <= 0){
                System.out.println("********************************************************************");
                System.out.println("*****************GANASTE, derrotaste a cthulhu**********************");
                System.out.println("********************************************************************");
            }
            else if(!jugadoresVivos(jugadores)){
                System.out.println("********************************************************************");
                System.out.println("*****************PERDISTE, un jugador ha muerto**********************");
                System.out.println("********************************************************************");
            }
        
        
    }

    public static boolean jugadoresVivos(Jugador [] jugadores) {
        
        boolean todosVivos = true;
        
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].isVivo() == false){
                todosVivos = false;
            }
        }
        return todosVivos;
        
    }

    public static void lucharCthulhu(Jugador jugador, Cthulhu cthulhu) {
        System.out.println("---------------------------------LUCHANDO CON CTHULHU---------------------------------");
        System.out.println("Vida actual de Cthulhu: " + cthulhu.getVida());
        
        
        int sumaDados = 0;
        //Tirada de dados
        for (int i = 0; i < jugador.getFuerza(); i++) {
            
            int dado = (int) (Math.random() * 6) + 1;
            
            System.out.println("Tirada del dado " + i + ": " + dado);
            System.out.println("");
            sumaDados += dado;
        }
        System.out.println("Suma de dados: " + sumaDados);
        System.out.println("");
        
        //Restamos vida a Cthulhu
        cthulhu.setVida(cthulhu.getVida() - sumaDados);
        
        System.out.println("Vida restante de Cthulhu: " + cthulhu.getVida());
        
        System.out.println("");
        
        //Restamos vida al jugador
        jugador.setVida(jugador.getVida() - 1);
        System.out.println("Vida del jugador restante: " + jugador.getVida());
        
    }

    public static void cogerCarta(Jugador jugador) {
        System.out.println("---------------------------------AGARRANDO CARTA---------------------------------");
        //Recorremos el array de cartas y elegimos una random
        int numRandom = (int) (Math.random() * 4);
        
        //Guardamos la carta en una variable
        Carta carta = jugador.getCarta(numRandom);
        
        System.out.println(carta.getFraseCarta());
        
        //Segun el nombre de la carta, se suma o se resta vida/fuerza
        switch (carta.getFraseCarta()) {
            case "Obtienes un punto de vida":
                jugador.setVida(jugador.getVida()+1);
                System.out.println("Ahora su vida es:" + jugador.getVida());
                break;
            case "Te quitan un punto de vida":
                jugador.setVida(jugador.getVida()-1);
                System.out.println("Ahora su vida es:" + jugador.getVida());
                break;
            case "Obtienes un punto de fuerza":
                jugador.setFuerza(jugador.getFuerza()+1);
                System.out.println("Ahora su fuerza es:" + jugador.getFuerza());
                break;
            case "Te quitan un punto de fuerza":
                jugador.setFuerza(jugador.getFuerza()-1);
                System.out.println("Ahora su fuerza es:" + jugador.getFuerza());
                break;
            case "Obtienes dos puntos de vida":
                jugador.setVida(jugador.getVida()+2);
                System.out.println("Ahora su vida es:" + jugador.getVida());
                break;
        }
        
    }

    public static void reponerVida(Jugador jugador) {
        System.out.println("---------------------------------DESCANSO---------------------------------");
        jugador.setVida(jugador.getVida()+1);
        
        System.out.println("Ahora su vida es:" + jugador.getVida());
    }
    
}

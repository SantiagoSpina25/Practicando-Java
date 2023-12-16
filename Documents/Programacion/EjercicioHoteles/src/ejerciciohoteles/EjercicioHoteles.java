
package ejerciciohoteles;
import java.util.Scanner;
import java.util.Arrays;

public class EjercicioHoteles {


    public static void main(String[] args) {
        //Declaracion de variables Scanner, turnos y ganado
        Scanner sc = new Scanner(System.in);
        int turnos = 1;
        boolean ganado = false;
        
        System.out.println("*******COMIENZA EL JUEGO: EL COMPLEJO HOTELERO NO TAN COMPLEJO*********");
        
        //Registramos nombre y creamos jugador
        System.out.println("Nombre del jugador:");
        Jugador jugador = new Jugador(sc.next());
        
        //Creacion del tablero/array de hoteles
        Hotel [] tableroHoteles = new Hotel [6];
        tableroHoteles[0] = new HotelBoom();
        tableroHoteles[1] = new HotelChinatown();
        tableroHoteles[2] = new HotelPresident();
        tableroHoteles[3] = new HotelWaikiki();
        tableroHoteles[4] = new HotelFontaine();
        tableroHoteles[5] = new HotelBlue();
        
        //Iniciamos un bucle (do while), que se realiza hasta que los turnos (12) pasen, el jugador pierda (se quede sin dinero o el jugador gane (compre todos los hoteles)
        
        do {            
           
            //Mostramos turnos restantes, nombre del jugador y dinero restante
            System.out.println("Turno " + turnos + ": ");
            System.out.println("");
            System.out.println(jugador.getNombre() + " tienes " + jugador.getDinero() + " euros");
            
            //Mostramos el array de hoteles
            System.out.println(Arrays.toString(tableroHoteles));
            System.out.println("");
            
            System.out.println("Que desea hacer? 1.Tirar dado o 2.Pasar turno");
            int respuesta = sc.nextInt();
            
            switch (respuesta) {
                case 1://Tirar dado
                    
                    //Creamos un dado con valores del 1 al 6
                    int dadoHoteles = (int) (Math.random() * 6) + 1;
                    System.out.println("Tira el dado: " + dadoHoteles);
                    
                    //Cada valor del dado coincide con la posicion de cada hotel (hay que restarle uno a el valor del dado)
                    System.out.println(tableroHoteles[dadoHoteles - 1].getNombre());
                    
                    if(tableroHoteles[dadoHoteles - 1].isComprado()){
                        System.out.println("Ya tienes ese hotel, pierdes 500.000 euros");
                        jugador.setDinero(jugador.getDinero() - 500000);
                    }
                    else{
                        System.out.println("");
                        tirarDadoPrecios(tableroHoteles, dadoHoteles, jugador);   
                    }        
                    break;
                case 2://Pasar turno
                    System.out.println("Turno pasado");
                    break;
                default:
                    System.out.println("El numero introducido no esta entre el 1 y el 2, turno perdido");
                            
            }
            turnos++;
            jugador.setDinero(jugador.getDinero() + 500000);
            ganado = verificarSiGano(tableroHoteles);
            
        } while (turnos != 13 && jugador.getDinero() > 0 && !ganado);

        
        //Mensaje del fin del juego dependiendo de los turnos y el dinero
        if(!ganado){
            if(turnos == 13){
            System.out.println("");
            System.out.println("*******Fin del juego, se acabaron los turnos*******");
        }
            else if(jugador.getDinero() <= 0){
                System.out.println("");
                System.out.println("*******Fin del juego, te quedaste sin dinero*******");
            }
        }
        

        
    }
    
    
    

    public static void tirarDadoPrecios(Hotel[] tableroHoteles, int dadoHoteles, Jugador jugador) {
        
        //Cramos dado de precios con valores del 0 al 3
        int dadoPrecios = (int) (Math.random() * 4);
        System.out.println("Tira el dado: " + dadoPrecios);
        
        //Segun el numero que toque, el jugador comprara el hotel gratis, por el precio original, el doble o el triple (sin comprarlo)
        
        switch (dadoPrecios) {
            case 0://Gratis
                System.out.println("Te sale gratis!");
                tableroHoteles[dadoHoteles - 1].setComprado(true);
                break;
            case 1://Precio original
                System.out.println("Te sale: " + tableroHoteles[dadoHoteles - 1].getPrecio());
                jugador.setDinero(jugador.getDinero() - tableroHoteles[dadoHoteles - 1].getPrecio());
                tableroHoteles[dadoHoteles - 1].setComprado(true);
                break;
            case 2://Doble del precio original
                System.out.println("Te sale: " + tableroHoteles[dadoHoteles - 1].getPrecio() * 2 + " (doble del precio original)");
                jugador.setDinero(jugador.getDinero() - (tableroHoteles[dadoHoteles - 1].getPrecio() * 2));
                tableroHoteles[dadoHoteles - 1].setComprado(true);
                break;
            case 3://Triple del precio original
                System.out.println("Pagas el triple: " + tableroHoteles[dadoHoteles - 1].getPrecio() * 3 + " (y no lo compras)");
                jugador.setDinero(jugador.getDinero() - (tableroHoteles[dadoHoteles - 1].getPrecio() * 3));
                break;
        }
        
        System.out.println("");
    }

    public static boolean verificarSiGano(Hotel [] tableroHoteles) {
        int contador = 0;
        boolean ganado;
        for (int i = 0; i < tableroHoteles.length; i++) {
            if(tableroHoteles[i].isComprado()){
                contador++;
            }
        }
        
        if(contador == 6){
            System.out.println("HAS GANADO! CONSEGUISTE COMPRAR TODOS LOS HOTELES");
            ganado = true;
        }
        else{
            ganado = false;
        }
        
        return ganado;
    }
    
}

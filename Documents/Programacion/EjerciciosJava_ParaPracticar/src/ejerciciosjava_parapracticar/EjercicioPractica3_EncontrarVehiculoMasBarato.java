
package ejerciciosjava_parapracticar;

import java.util.Scanner;
import java.util.Arrays;

public class EjercicioPractica3_EncontrarVehiculoMasBarato {
    
    public static void main(String []args){
        
        // Enunciado
        
        /* Construir un programa que dada una serie de vehiculos caracterizados por su marca, modelo y precio, imprima las propiedades
        del vehiculo mas barato. Para ello, se deberan leer por teclado las caracteristicas de cada vehiculo y crear una clase que represente a cada uno de ellos.
        */
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println("Bienvenido!");
        System.out.println("Cuantos vehiculos va a ingresar? ");
        Vehiculo [] arrayVehiculos = new Vehiculo[sc.nextInt()];
        
        do {            
            System.out.println("Que desea realizar?");
            System.out.println("1.Ingresar vehiculo");
            System.out.println("2.Vehiculo mas barato");
            System.out.println("3.Mostrar Vehiculos");
            System.out.println("4.Salir");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    ingresarVehiculo(arrayVehiculos);
                    break;
                case 2:
                    mostrarVehiculoMasBarato(arrayVehiculos);
                    break;
                case 3:
                    mostrarVehiculos(arrayVehiculos);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    opcion = 5;
                    break;
                default:
                    System.out.println("Numero no esta entre 1 y 4, Saliendo...");
                    opcion = 5;
                    break;
            }
            
        } while (opcion != 5);
        
    }
    
    
    
    
    public static void ingresarVehiculo(Vehiculo[] arrayVehiculos){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < arrayVehiculos.length; i++) {
            System.out.println("Vehiculo " + (i + 1));
            
            System.out.println("Marca?");
            String marcaVehiculo = sc.next();
            
            System.out.println("Modelo?");
            String modeloVehiculo = sc.next();
            
            System.out.println("precio?");
            int precioVehiculo = sc.nextInt();
            
            arrayVehiculos[i] = new Vehiculo(marcaVehiculo, modeloVehiculo, precioVehiculo);
            
        }
        
        System.out.println("");
    }

    
    public static void mostrarVehiculos(Vehiculo[] arrayVehiculos) {
        System.out.println(Arrays.toString(arrayVehiculos));
        
        System.out.println("");
    }
    
    
    public static void mostrarVehiculoMasBarato(Vehiculo[] arrayVehiculos) {
        
        Vehiculo vehiculoAux = arrayVehiculos[0];
       
        for (int i = 0; i < arrayVehiculos.length; i++) {
            if(vehiculoAux.getPrecio() > arrayVehiculos[i].getPrecio()){
                vehiculoAux = arrayVehiculos[i];
            }
            
        }
        System.out.println("El vehiculo mas barato es: " + vehiculoAux);
    }
    
    
}

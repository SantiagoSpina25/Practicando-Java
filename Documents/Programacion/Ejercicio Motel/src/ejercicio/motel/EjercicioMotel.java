
package ejercicio.motel;
import java.util.Scanner;

public class EjercicioMotel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al motel alcatel, que queres hacer");
        boolean preguntar = true;
        
        Huesped [] habitaciones = new Huesped [20];
        
        do {            
            
            System.out.println("1. Insertar huesped, 2. N. de habitaciones libres, 3. Calcular precio por nombre de huesped, 4. Eliminar huesped por nombre, 5. Buscar"
                    + "huesped por nombre, 6. Buscar huesped por numero de habitacion, 7.salir");
            
            int opcion = sc.nextInt();        
            
            switch (opcion) {
                 case 1: //Ingresar huesped
                    
                    if(estaLlena(habitaciones)){
                        System.out.println("Las habitaciones estan llenas");
                    } 
                    else{
                        System.out.println("Nombre del huesped");
                        String nuevoHuesped = sc.next();
                        System.out.println("Cantidad de noches del huesped");
                        int nochesHuesped = sc.nextInt();
                        
                        for (int i = 0; i < habitaciones.length; i++) {
                            if(habitaciones[i] == null){
                                habitaciones[i] = new Huesped(nuevoHuesped, nochesHuesped);
                                break;
                            }
                        }
                    }
                    
                    break;
                 case 2:// Mostrar numero de habitaciones libres
                    
                   int contador = 0;
                   for (int i = 0; i < habitaciones.length; i++) {
                       if(habitaciones[i] == null){
                           contador++;
                       }
                   }
                   
                     System.out.println("Cantidad de habitaciones libres: " + contador);
                     
                    break;
                 case 3:// Calcular precio x nombre huesped
                    
                     System.out.println("Ingrese nombre de huesped que busca"); 
                     String nomHuesped = sc.next();
                     
                     for (int i = 0; i < habitaciones.length; i++) {
                         if(habitaciones[i]!=null){
                             if(nomHuesped.equalsIgnoreCase(habitaciones[i].getNombre())){
                             System.out.println("Huesped encontrado");
                             System.out.println("Precio de noches: " + habitaciones[i].getPrecio());
                            }
                         }
                         
                     }
                     
                     
                    break;
                 case 4:
                    
                    break;
                 case 5:
                    
                    break;
                 case 6:
                    
                    break;
                 case 7:
                     System.out.println("Ok saliendo");
                     preguntar = false;
                    break;
                 default:
                    System.out.println("El numero no esta entre el 1 y el 7");
                    preguntar = false;
            }
            

            
             
            
        } while (preguntar);
        
        
//        a
        
        
        
        
    }
    
    
    public static boolean estaLlena(Huesped [] habitaciones){
        int contador = 0;
        boolean rta = false;
        for (int i = 0; i < habitaciones.length; i++) {
            if(habitaciones[i] == null){
                contador++;
            }
       }
        if(contador == 0){
            rta = true;
        }
        
        return rta;
    }
    
    
    
    
}

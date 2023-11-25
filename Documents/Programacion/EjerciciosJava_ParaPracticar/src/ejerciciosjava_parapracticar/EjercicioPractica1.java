
package ejerciciosjava_parapracticar;

import java.util.Arrays;
import java.util.Scanner;


public class EjercicioPractica1 {
    
    public static void main(String []args) {
        
        /* Enunciado
         Crear un array de 10 numeros, que los numeros los introduzca por teclado y se almacenen automaticamente en el array
        y crear dos funciones 1. Ver array entero, 2. Suma total de los numeros, 3. Cuales y cuantos numeros son mayores a diez, 4. cual es el mayor,5 cual es el menor y 6. salir
        */
        
        // Creamos un objeto Scanner para pedir numeros por teclado
        Scanner sc = new Scanner(System.in);
        
        // Creamos un array vacio de longitud 10
        int [] arrayNumeros = new int [10];
        
        // Hacemos un bucle que pida 10 veces (longitud del array) un numero por teclado y que se vaya almacenando en las posiciones del array
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Introduzca numero " + (i + 1) );
            arrayNumeros[i] = sc.nextInt();
        }
        
        // Creacion del menu para elegir que hacer
        int opcion;
        do {            
            
            System.out.println("¿Que desea realizar con el array?");
            
            System.out.println("1. Mostrar array, 2. Sumar todos los numeros, 3. Ver cuales y cuantos numeros son mayores a diez, 4. Mostrar el numero mas alto, 5. Mostrar el numero mas bajo y 5. salir");
            opcion = sc.nextInt();
            
            
            switch (opcion) {
                case 1://Mostrar array
                    mostrarArray(arrayNumeros);
                    break;
                case 2://Sumar numeros
                    System.out.println("Suma total: " + sumarNumeros(arrayNumeros));
                    break;
                case 3://Cuales y cuantos numeros son >10
                    mostrarNumerosMayoresADiez(arrayNumeros);
                    break;
                case 4://Cual es el mayor
                    System.out.println("Mayor numero: " + mostrarMayor(arrayNumeros));
                    break;
                case 5: // Cual es el menor
                    System.out.println("Menor numero: " + mostrarMenor(arrayNumeros));
                    break;
                default://Salir
                    System.out.println("saliendo...");
                    opcion = 6;
            }
            
        } while (opcion != 6);
    }
    
    
    public static void mostrarArray(int [] arrayNumeros){
        
        // Forma con Arrays
         System.out.println(Arrays.toString(arrayNumeros));
        
        // Forma con for
        
        // for (int i = 0; i < arrayNumeros.length; i++) {
        //     System.out.print("{ " + arrayNumeros[i] + " }, ");
        //  }
    }

    public static int sumarNumeros(int[] arrayNumeros) {
        int suma = 0;
        // Recorremos el array y vamos acumulando la suma
        for (int i = 0; i < arrayNumeros.length; i++) {
            suma += arrayNumeros[i];
            
            // Es lo mismo que esto
            // suma = suma + arrayNumeros[i]
        }
        return suma;
    }

    public static void mostrarNumerosMayoresADiez(int[] arrayNumeros) {
        // Inicializamos un contador para almacenar la cantidad de numeros mayores a 10
        int contador = 0;
        
        System.out.println("Numeros mayores a diez: ");
        // Recorremos el array y mostramos los numeros mayores a 10
        for (int i = 0; i < arrayNumeros.length; i++) {
            if(arrayNumeros[i] > 10){
                System.out.println(arrayNumeros[i]);
                contador++;
            }
        }
        System.out.println("Cantidad de numeros mayores a diez: " + contador);
    }

    public static int mostrarMayor(int[] arrayNumeros) {
        // Ordenamos de menor a mayor con Arrays.sort
        // Arrays.sort(arrayNumeros);
        
        // O lo hacemos mediante un bucle for
        int mayor = arrayNumeros[0];
        for (int i = 0; i < arrayNumeros.length; i++) {
            if(arrayNumeros[i]>mayor){
                mayor = arrayNumeros[i];
            }
            
        }
        
        // return arrayNumeros[arrayNumeros.length - 1];
          return mayor;
    }

    public static int mostrarMenor(int[] arrayNumeros) {
        // Ordenamos de menor a mayor con Arrays.sort
        // Arrays.sort(arrayNumeros);
        
        // O lo hacemos mediante un bucle for
        int menor = arrayNumeros[0];
        for (int i = 0; i < arrayNumeros.length; i++) {
            if(arrayNumeros[i]<menor){
                menor = arrayNumeros[i];
            }
            
        }
        
        // return arrayNumeros[0];
          return menor;
    }
    
}


package ejerciciosjava_parapracticar;

import java.util.Arrays;


public class EjercicioPractica2_MatricesBasico {
    
    public static void main(String[]args){
        
        /* Crear una matriz 10x10 con este resultado:
        
        [X, X,  X, X, X, X, X, X,X, X]
        [X, X,  X, X, X, X, X, X,X, X]
        [X, X,   ,  ,  ,  ,  ,  ,       X, X]
        [X, X,  , X, X, X, X,  ,   X, X]
        [X, X,  , X, X, X, X,  ,   X, X]
        [X, X,  , X, X, X, X,  ,   X, X]
        [X, X,  , X, X, X, X,  ,   X, X]
        [X, X,   ,  ,  ,  ,  ,  ,       X, X]
        [X, X,  X, X, X, X, X, X,X, X]
        [X, X,  X, X, X, X, X, X,X, X]
        
        
        Rellenarla con un metodo y hacer los huecos con otro
        */
        
        //Creamos la matriz 10x10
        char [] [] matriz = new char [10] [10];
        
        //Rellenamos matriz
        rellenarMatriz(matriz, 'X');
        
//        //Mostramos matriz
//        mostrarMatriz(matriz);
        
        //Rellenamos con los huecos
        rellenarVaciosMatriz(matriz);
        //Mostramos matriz
        mostrarMatriz(matriz);
        
    }

    public static void rellenarMatriz(char[][] matriz, char c) {
        
        for (int fila = 0; fila < matriz.length; fila++) {
        
            for (int columna = 0; columna < 10; columna++) {
                 matriz[fila][columna] = c;
            }
            
        }
        
    }

    public static void mostrarMatriz(char[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.println(Arrays.toString(matriz[fila]));
        }
    }
    
    public static void rellenarVaciosMatriz(char[][] matriz){

        
        rellenarVaciosFilas(matriz, 2);
        rellenarVaciosFilas(matriz, 7);
        rellenarVaciosColumnas(matriz, 2);
        rellenarVaciosColumnas(matriz, 7);
        
        
        // Version sin metodos
//        //Filas
//        for (int i = 2; i < 8; i++) {
//            matriz[2][i] = ' ';
//        }
//        
//        for (int i = 2; i < 8; i++) {
//            matriz[7][i] = ' ';
//        }
//        
//        //Columnas
//        for (int i = 2; i < 8; i++) {
//            matriz[i][2] = ' ';
//        }
//        
//        for (int i = 2; i < 8; i++) {
//            matriz[i][7] = ' ';
//        }

    }
    
    public static void rellenarVaciosFilas(char[][] matriz, int fila){
        for (int i = 2; i < 8; i++) {
            matriz[fila][i] = ' ';
        }
    }
    public static void rellenarVaciosColumnas(char[][] matriz, int columna){
        for (int i = 2; i < 8; i++) {
            matriz[i][columna] = ' ';
        }
    }
    
}

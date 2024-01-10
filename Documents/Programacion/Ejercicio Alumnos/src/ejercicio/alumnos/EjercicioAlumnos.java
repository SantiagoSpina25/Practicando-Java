
package ejercicio.alumnos;

import java.util.Scanner;


public class EjercicioAlumnos {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resp = 0;
        int pos=0;
        Persona[] alumnos = new Persona[100];
        do {
            System.out.println("1 Insertar alumno, 2 Mostrar alumnos, 3 Mostrar alumnas, 4 Mostrar suspensos, 5 Mostrar estadistica de alumnos,6 salir ");
            resp = sc.nextInt();
            
            switch(resp){
                case 1: 
                        System.out.println("1.Crear alumno o 2.Crear alumna  ");
                        int eleccion = sc.nextInt();
                        System.out.println("Nombre?");

                    switch (eleccion) {
                        case 1:
                            alumnos[pos] = new Alumno(sc.next());
                            alumnos[pos].ingresar();
                            pos++;
                            break;
                        case 2:
                            alumnos[pos] = new Alumna(sc.next());
                            alumnos[pos].ingresar();
                            pos++;
                            break;
                        default:
                            System.out.println("El numero introducido no es ni un 1 ni un 2");
                            break;
                    }
                    
                    break;
                    
                case 2:
                    for (int i = 0; i < pos; i++) {
                        if (alumnos[i] instanceof Alumno) {
                            System.out.println(alumnos[i]);
                            
                        }
                        
                    }
                    break;
                    
                    
                case 3:
                    for (int i = 0; i < pos; i++) {
                        if (alumnos[i] instanceof Alumna) {
                            System.out.println(alumnos[i]);
                            
                        }
                        
                    }
                    break;
                    
                    
                case 4:
                    System.out.println("1 Alumnos o 2 Alumnas");
                    int eleccionSuspensos = sc.nextInt();
                    
                    for (int i = 0; i < pos; i++) {
                        alumnos[i].estaAprobado();
                        if (eleccionSuspensos == 1) {
                            if (alumnos[i] instanceof Alumno &&alumnos[i].isSuspenso()) {
                                System.out.println(alumnos[i]);
                                
                            }else{
                                if (alumnos[i] instanceof Alumna &&alumnos[i].isSuspenso()) {
                                System.out.println(alumnos[i]);
                            
                            }
                        }
                    }
                  }
                break;
                    
                case 5:
                    int contMasculino= 0;
                    int contFemenino = 0;
                    for (int i = 0; i < pos; i++) {
                        if (alumnos[i].isSuspenso() && alumnos[i]instanceof Alumno) {
                            contMasculino++;
                            
                            
                        }
                        else if((alumnos[i].isSuspenso() && alumnos[i]instanceof Alumna)){
                            contFemenino++;
                        }
                        
                    }
                    
                    System.out.println("Pibes suspensos =" +contMasculino/pos +", "+ "Pibas suspensas ="+ contFemenino/pos);
            
            
            }
            
        } while (resp !=6);
    }
    
}

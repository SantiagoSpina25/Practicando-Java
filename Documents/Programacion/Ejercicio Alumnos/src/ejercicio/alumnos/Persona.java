
package ejercicio.alumnos;

import java.util.Scanner;


public class Persona {
    protected String nombre;
    protected double[] notas;
    boolean suspenso = false;
    Scanner sc = new Scanner(System.in);

    //constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        notas = new double[6];
    }

    public void ingresar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce la nota");
            notas[i] = sc.nextDouble();

        }
    }

    public void estaAprobado() {

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                suspenso = true;
            }
        }
    }

    @Override
    public String toString() {
        String respuesta = "";
        for (int i = 0; i < notas.length; i++) {

            respuesta = respuesta + notas[i] + "||";

        }
        return nombre + " " + respuesta;
    }

    boolean isSuspenso() {
        estaAprobado();
        return suspenso;
    }
}

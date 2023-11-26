
package elementos_basicos;


public class HerenciaYPolimorfismo {
    
    
    public static void main(String [] args){
        
        Empleado empleado1 = new Empleado(1000, "Santiago", 19);
        Persona persona1 = new Persona("Jorge",46);
        
        empleado1.comer();
        persona1.comer();
        
    }
}

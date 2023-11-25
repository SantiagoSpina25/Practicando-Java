
package elementos_basicos;

public class Conversiones {
    
    public static void main(String []args) {
        
        // --------------------------------------------------Castings--------------------------------------------------
        
        // Implicitos (Se realizan automaticamente)
        
        int a = 100;
        long b = a;
        System.out.println(b);
        // Nos deja realizarlo debido a que los valores de un INT estan dentro de un LONG
        
        // Explicitos (Hay que realizarlos manualmente)
        
        long c = 1000;
        int d = (int) c;
        
        // En este hay que convertirlo manualmente ya que un LONG no esta dentro de un INT
        
        
        
        
        // --------------------------------------------------Parseos--------------------------------------------------
        
         // Mediante los parseos podemos convertir un tipo de valor a otro, por ejemplo, un String a un numero:
         
         String numero1 = "1";
                
         int numeroInt = Integer.parseInt(numero1);
         
         System.out.println("Suma de 1+1: " + (1 + numeroInt));
        
        // Lo mismo con otros valores como por ej Double
        
        // Tambien al reves, de un numero a un String
        
        int numero2 = 5;
        
        String numeroAString = String.valueOf(numero2);
        System.out.println("Mi numero es: " + numero2);
        
        
    }
    
}

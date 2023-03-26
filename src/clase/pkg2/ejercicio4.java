/*
Define una variable que aloje tu nombre y otra que guarde tu edad. 
Imprime ambas variables por pantalla.
Recomendamos que hagan el siguiente experimento: tipear en minúsculas la palabra 
sout y apenas terminamos de escribirla tocar el botón tab o mejor dicho tabular.
Esto nos va a generar un System.out.println() para poder escribir lo que queramos.


 */
package clase.pkg2;
import java.util.Scanner;
/**
 *
 * @author pelle
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese edad");
        short edad=leer.nextShort();
        System.out.println("Ingrese nombre");
        String nombre=leer.next();
        System.out.println("Mi nombre es "+nombre+" y tengo "+ edad+" años");
    }
    
}

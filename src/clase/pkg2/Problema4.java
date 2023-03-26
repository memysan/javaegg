/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author pelle
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("Cuantos grados Fº en Cº son?");
        double Temp=leer.nextInt();
        double Far=32+(9*Temp/5);
        System.out.println("La temperatura en Fahrenheit es: "+Far);
        
    }
    
}

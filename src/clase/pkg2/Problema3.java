/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas
 y después toda en minúsculas. 
 investigar la función toUpperCase() y toLowerCase() en Java
 */
package clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author pelle
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese frase:");
        String frase=leer.nextLine();
        String Mayus=frase.toUpperCase();
        String Minus=frase.toLowerCase();
        System.out.println(Mayus);
        System.out.println(Minus);
        
    }
    
}

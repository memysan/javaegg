/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author pelle
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num=leer.nextInt();
        
        System.out.println("El doble es: "+num*2+" El triple es: "+num*3+" La raiz es: "+Math.sqrt(num));
    }
    
}

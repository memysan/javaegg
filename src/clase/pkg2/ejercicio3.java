/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author pelle
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, numero1, resultado; 
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese primer valor");
        numero=leer.nextInt();
        System.out.println("Ingrese segundo valor");
        numero1=leer.nextInt();
        resultado=numero+numero1;
        System.out.println("El resultado es:"+resultado);
    }
    
}

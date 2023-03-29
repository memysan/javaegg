/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author irigo
 */
public class extra12Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular la cantidad de digitos");
        int num=leer.nextInt(),cont=1;
        while (num>=10) {
            num/=10;
            cont++;
        }
        System.out.println(cont);
    }
    
}
        
        
    
    


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
/*Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los 
números introducidos supere el límite inicial.
*/
public class ej5Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un valor limite");
        int num=leer.nextInt();
        int suma=0;
        while(suma<= num){
            System.out.println("Ingrese un numero");
            suma= suma+leer.nextInt();
            
            
        }
        
          System.out.println("Usted supero el limite");      
    }
    
}

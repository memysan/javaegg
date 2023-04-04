/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author irigo
 */
public class ej3Guia5 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
     * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
         int[] vector= {7,15,177,121,52345};
        String aux="";
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        
        for (int i = 0; i < 5; i++) {
            aux= String.valueOf(vector[i]);
            
            switch (aux.length()) {
                case 1: cont1++;
                    break;
                case 2: cont2++;
                    break;
                case 3: cont3++;
                    break;
                case 4: cont4++;
                    break;
                case 5: cont5++;
                    break;
            }
        }
        System.out.println("EL VECTOR POSEE ");
        System.out.println("Elementos de 1 digito: " + cont1 + "\nElementos de 2 digitos: "+ cont2 + "\nElementos de 3 digitos: "+ cont3+ "\nElementos de 4 dígitos: "+cont4+"\nElementos de 5 dígitos: "+cont5);
        
    }
    
}



       
       
        
         
    


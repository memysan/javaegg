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
public class ej2Guia5 {

    /**
     * Realizar un algoritmo que llene un vector de tamaño N 
     * con valores aleatorios y le pida al usuario un número a
     * buscar en el vector. El programa mostrará dónde se encuentra
     * el numero y si se encuentra repetido

     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        int[] vector = new int [10];
       
        System.out.println("El vector es; ");
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random()*10);
            System.out.print("[" + vector[i] + "] " );
        }
        System.out.println(" ");        
        System.out.println("Que numero queres buscar");
        int respuesta = leer.nextInt();
        int cont = 0;
        
        for (int i = 0; i < 10; i++) {
            if (vector[i] == respuesta) {
                cont ++;
                System.out.println("El numero se encontro en la posicion " + i );
                
            }
        }
         
        
        if (cont>1){
        System.out.println("El numero esta repetido y se encontro " + cont + " veces");
        }
        
        
        else {
            System.out.println("El numero no fue encontrado");
        } 
                
    }

}
   

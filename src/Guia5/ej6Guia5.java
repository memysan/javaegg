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
public class ej6Guia5 {

    /**
     * Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int [3][3];
                int aux1=0, aux2=0, aux3=0;
        boolean corrob = true;
        
        System.out.println("Rellene la matriz de 3x3 con valores del 1 al 9");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            do {
                matriz[i][j]=leer.nextInt();
            } while (matriz[i][j]<0 || matriz[i][j]>10);    
            }
                       
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0) {
                 aux1 += matriz[i][j];
                 
                }
                aux2 += matriz[i][j];
            }
           if(aux1 != aux2){
               corrob = false;
               System.out.println("El cubo no es mágico");
               return;               
           }
           aux2 = 0;
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                aux2 += matriz[i][j];                
            }
            if(aux1 != aux2){
               corrob = false;
               System.out.println("El cubo no es mágico");
               return;               
           }
            aux2 = 0; 
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j){
                 aux2 += matriz[i][j];
                 
                }
                if(i+j == 2){
                 aux3 += matriz[i][j];
                 
                }
            }
        }
        if (aux1 != aux2 || aux1!= aux3) {
                           corrob = false;
               System.out.println("El cubo no es mágico");
               return;
        }
        System.out.println("El cubo es mágico");
    }
  
}
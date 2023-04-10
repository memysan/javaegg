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
public class extra6Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          /* Realizar un programa que llene una matriz de tamaño NxM con valores 
        aleatorios y muestre la suma de sus elementos.   
        */
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de filas de la matriz");
        int n = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de columnas de la matriz");
        int m = leer.nextInt();
        int [][] matriz = new int [n][m];
                
        int suma=0;        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {                
                suma += matriz[i][j]=(int)(Math.random()*10+1);
            }
            
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j]+ " ");
                
            }
            System.out.println(" ");
        }
       
        System.out.println("La suma de los valores es: " + suma);
    }
    
}
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
public class extra1Guia5 {

    /**
     
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector");
        int dim=leer.nextInt();
        int[] vector= new int[dim];
        int suma=0;
        for (int i = 0; i < dim; i++) {
            System.out.println("Ingrese el valor para la posicion " + i);
            vector[i]=leer.nextInt();
            suma+=vector[i];
        }
        System.out.println("La suma de los valores del vector es: "+ suma);
    }
    }
    



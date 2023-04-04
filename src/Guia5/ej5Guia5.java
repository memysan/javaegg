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
public class ej5Guia5 {

    /**
     * Realice un programa que compruebe si una matriz dada es antisimétrica. 
     */
    public static void main(String[] args) {
         int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matrizT = new int[3][3];

        System.out.println("MATRIZ A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] >= 0) {
                    System.out.print(" " + matriz[i][j] + "  ");
                } else {
                    System.out.print(matriz[i][j] + "  ");
                }
            }
            System.out.println("");
        }
        System.out.println(" MATRIZ TRANSPUESTA");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = matriz[j][i];
                if (matrizT[i][j] >= 0) {
                    System.out.print(" " + matrizT[i][j] + "  ");
                } else {
                    System.out.print(matrizT[i][j] + "  ");
                }
            }
            System.out.println("");
        }
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == -matrizT[i][j]) {
                } else {
                    cont = 1;
                }
            }
        }
        if (cont == 1) {
            System.out.println("La matriz A no es antisimétrica");
        } else {
            System.out.println("La matriz A es antisimétrica");
        }

    }
}
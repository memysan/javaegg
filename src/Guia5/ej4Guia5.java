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
public class ej4Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int matriz[][] = new int[4][4];
        int matrizT[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                matriz[i][j] = (int) (Math.random() * 100);

            }

        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[j][i] = matriz[i][j];
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("la matriz transpuesta es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizT[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.S;

/**
 *
 * @author irigo
 */
public class extra2Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double[][] matriz = new double[11][6];
        int aprob = 0, desap = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0) {
                    matriz[i][j] = j + 1;
                } else {
                    if (j == 1) {
                        System.out.println("Ingrese la nota del primer practico evaluativo del alumno " + (i));
                        matriz[i][j] = leer.nextInt();
                    }
                    if (j == 2) {
                        System.out.println("Ingrese la nota del segundo practico evaluativo del alumno " + (i));
                        matriz[i][j] = leer.nextInt();
                    }
                    if (j == 3) {
                        System.out.println("Ingrese la nota del primer integrador del alumno " + (i));
                        matriz[i][j] = leer.nextInt();
                    }
                    if (j == 4) {
                        System.out.println("Ingrese la nota del segundo integrador del alumno " + (i));
                        matriz[i][j] = leer.nextInt();
                    }
                }

                matriz[i][5] = matriz[i][1] * 0.10 + matriz[i][2] * 0.15 + matriz[i][3] * 0.25 + matriz[i][4] * 0.5;
            }

        }

        for (int i = 1; i < 11; i++) {
            if (matriz[i][5] >= 7) {
                aprob++;
            } else {
                desap++;
            }
        }
        System.out.println("La cantidad de aprobados es: " + aprob);
        System.out.println("La cantidad de desaprobados es: " + desap);
    }

}

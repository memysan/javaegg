/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author irigo
 */
public class aLaObra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] equipo = new String[2];
        int[][] matriz = {{4,8,9},{5,8,6}};
        String aux;
//        for (int i = 0; i < equipo.length; i++) {
//            equipo[i] = leer.next();
//        }
        
        for (int[] fila: matriz) {
            aux = "";
            for (int columna:fila){
                aux += " "+ columna; // aux = aux + " " + columna
            }
            System.out.println(aux);
        }
    }

}


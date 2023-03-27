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
public class extra7Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        float altge = 0, altme = 0;
        int cont = 0, cont1 = 0;
        do {

            System.out.println("Ingrese la altura");
            float alt = leer.nextFloat();
            altge += alt;

            if (alt <= 1.60) {
                if (alt == 0) {
                    break;
                }
                altme += alt;
                cont++;

            }

            cont1++;
        } while (true);

        System.out.println("el promedio general es " + (altge / cont1) + " mtrs" + "\n" + " y el promedio de menores de 1,60 es " + (altme / cont));

    }

}

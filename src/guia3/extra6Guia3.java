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
public class extra6Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tipo de socio");
        String letra = leer.next().toUpperCase();
        System.out.println("Ingrese el monto real del tratamiento");
        double monto = leer.nextDouble();
        switch (letra) {
            case "A":
                System.out.println("su costo es " + (monto * 0.5));
                break;
            case "B":
                System.out.println("su costo es " + (monto * 0.65));

                break;
            case "C":
                System.out.println("su costo es " + monto);
                break;
            default:
                System.out.println("no tenes la cuota al dia");
        }
    }

}

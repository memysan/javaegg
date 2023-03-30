/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author irigo
 */
public class ej3Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese monto a cambiar");
        double monto = leer.nextDouble();
        System.out.println("ingrese la divisa: \n dolar \n libras \n yenes");
        String euro = leer.next();
        convertir(euro, monto);

    }

    public static void convertir(String euro, double monto) {
        switch (euro) {
            case "yenes":

                System.out.println("Su monto es " + (monto * 129.852));
                break;
            case "libras":
                System.out.println("Su monto es: " + (monto * 0.86));
                break;
            case "dolar":
                System.out.println("Su monto es: " + (monto * 1.28611));
                break;
            default:
                System.out.println("No manejamos esa moneda");
        }
    }

}

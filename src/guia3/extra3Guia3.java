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
public class extra3Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos que desea convertir: ");
        int min=leer.nextInt(),horas=min/60,dias=horas/24;
        horas=horas-dias*24;
        if (dias<1) {
            System.out.println("Sus minutos son " + horas + " Hora/s");
        }else{
        System.out.println("Sus minutos son " + dias + " Dia/s y " + horas + " Hora/s.");
    }
    
}
}
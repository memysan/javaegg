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
public class pruebados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        String respuesta;
        int edad = 0;
        do {
            mostrar(nombre, edad);
            System.out.println("Quiere seguir mostrando personas?");
             respuesta = leer.nextLine();
            System.out.println(respuesta);
        } while (!"no".equals(respuesta));
        // TODO code application logic here
    }

    public static String mostrar(String nombre, int edad) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" Escriba nombre: ");
        nombre = leer.next();
        System.out.println(" Escriba edad: ");
        edad = leer.nextInt();
        System.out.println(nombre + " tiene " + edad + " años");
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        return null;
    }
        
        
        
    }
    


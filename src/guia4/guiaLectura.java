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
public class guiaLectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase");
        String frase=leer.nextLine();
        String subcadena, cadena;
        
        subcadena= frase.replace("a", "@").replace("e","#").replace("i","$").replace("o", "%").replace("u", "&");
        
        System.out.println(subcadena);
        
    }
    
}
 
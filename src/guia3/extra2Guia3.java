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
public class extra2Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuatro numeros");
        int a=leer.nextInt(),b=leer.nextInt(), c=leer.nextInt(),d=leer.nextInt();
        int aux=0;
        System.out.println("a="+a+"\n"+"b="+ b+"c="+c+"d="+d);
        aux=a;
        a=d;
        d=b;
        b=c;
        c=aux;
        System.out.println("a="+a+"b="+ b+"c="+c+"d="+d);
        
        
        
        
        
        
        
    }
    
}

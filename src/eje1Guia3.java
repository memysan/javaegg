
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irigo
 */
public class eje1Guia3 {
//    Crear un programa que dado un número determine si es par o impar.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero, por favor");
        int num= leer.nextInt();
       
        if(num % 2==0)
        {
            
            System.out.println("El numero es par "+ num);
        }else
            System.out.println("El numero es impar "+num);
        }
}

        
        
        
        
    
    

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
public class extra10Guia3 {
/*Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
    realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
    Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
    este resultado es el residuo, y el número de restas realizadas es el cociente.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos valores");
        int num= leer.nextInt(),num2=leer.nextInt(),cont=0, res=num2;
        
        while (res>= num2) {
            res=num-num2;
            System.out.println(num+"-"+num2+"="+res);
            num=res;
            cont++;
        }
        
        System.out.println("cociente ="+cont);
        System.out.println("resto ="+res);
        
        
        
        
        
    }
    
}

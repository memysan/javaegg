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
public class ej1Guia4 {

    /*Crea una aplicación que le pida dos números al usuario y este pueda 
elegir entre sumar, restar, multiplicar y dividir.
La aplicación debe tener una función para cada operación matemática
y deben devolver sus resultados para imprimirlos en el main.*/ 


    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        String operacion="n";
        System.out.println("Ingrese 2 numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        while ("n".equals(operacion)) {
            System.out.println("OPERACIONES");
            System.out.println("1:SUMAR");
            System.out.println("2:RESTAR");
            System.out.println("3:MULTIPLICAR");
            System.out.println("4:DIVIDIR");
            System.out.println("5:SALIR");
            int opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma entre dos numeros es: "+Suma(num1,num2));
                    break;
                case 2:
                    System.out.println("La resta entre dos numeros es: "+Resta(num1,num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es : "+Mult(num1,num2));
                    break;
                case 4:
                    System.out.println("La division es : "+Div(num1,num2));
                    break;
                case 5:
                    operacion="s";
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }
    public static int Suma(int num1, int num2){
        int Suma;
        Suma=num1+num2;
        return Suma;
    }
    public static int Resta(int num1, int num2){
        int Resta;
        Resta=num1-num2;
        return Resta;
    }
    public static double Div(int num1, int num2){
        double Div;
        Div=num1/num2;
        return Div;
    }
    public static int Mult(int num1, int num2){
        int Mult;
        Mult=num1*num2;
        return Mult;
    }
}
        
        
    
    


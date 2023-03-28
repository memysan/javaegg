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
public class extra9Guia3 {
/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
    debe detener la lectura y mostrar la cantidad de números leídos, la cantidad 
    de números pares y la cantidad de números impares. Al igual que en el ejercicio
    anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia
    break.*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int cont= 0,par= 0,impar= 0;
        
        
        do {
                System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            
            if (num % 5 == 0) {
                break;
            }if (num<0){
                System.out.println("Ingrese valores positivos");
            }else {
                cont++;
                if(num%2 == 0){
                    par++;
                }else{
                    impar++;
                }
            }
        } while (cont>0);
        System.out.println("Los numeros Pares son: "+par);
        System.out.println("Los numeros Impares son: "+impar);
    }

        
    }
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;



import java.util.*;

/**
 *
 * @author irigo
 */
public class extra11Guia3 {
/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10.
    El programa debe indicar al usuario si su respuesta es o no correcta.
    En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.
    Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random()*10+0),num2 = (int) (Math.random()*10+0),secreto=num1*num2;
        System.out.println("Adivine el resultado de la multiplicacion entre dos numeros aleatorios entre 0 y 10");
        int rta=leer.nextInt();
        while (rta!=secreto) {
            System.out.println("Incorrecto Ingrese otro numero");
            rta=leer.nextInt();
        }
        System.out.println("Correcto!");
    }
    
}

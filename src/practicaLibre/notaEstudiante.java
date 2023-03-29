/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaLibre;

import java.util.Scanner;

/**
 *
 * @author irigo
 */
public class notaEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        double n1,n2,n3,notaFinal;
        
        System.out.println("Ingrese la primera nota: ");
    n1=leer.nextDouble();
    System.out.println("Ingrese la segunda nota: ");
    n2=leer.nextDouble();
    System.out.println("Ingrese la tercera nota: ");
    n3=leer.nextDouble();
    
    notaFinal= calcularNotaFinal(n1,n2,n3);
        System.out.println("La nota final es: "+notaFinal);
    
    }
    
    public static double calcularNotaFinal(double n1,double n2,double n3){
        return (n1*0.3)+(n2*0.3)+(n3*0.4);
    }
}

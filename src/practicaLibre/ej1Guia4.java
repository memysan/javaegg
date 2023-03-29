

package practicaLibre;

import java.util.Scanner;


public class ej1Guia4 {

    
    public static void main(String[] args) {
       
      int resultado=suma(10,15);          
        System.out.println(resultado);
        saludoPersonalizado("memy");
        Scanner leer = new Scanner(System.in);
        String nombre=leer.next();
        saludoPersonalizado(nombre);
        
        saludoPersonalizado(leer.next());
        
        
        
        
    }
   
    public static int suma(int a, int b){
        
        int res=a+b;
          
        return res;
    }
    public static void saludoPersonalizado(String nombre){
        System.out.println("Hola "+ nombre+" como estas?");
    }
}



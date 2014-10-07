
package ejercicio2.pkg2;

import java.util.Scanner;


public class Ejercicio22 {

   
    public static void main(String[] args) {
        
        float lado = 0;
        float area = 0;
         
         System.out.println("Introduzca la base: ");
         Scanner base = new Scanner (System.in);
         lado = base.nextFloat();
         
         area = lado * lado;

    }
    
}

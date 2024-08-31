
package rangoedwin;

import java.util.Scanner;
 
public class RangoEdwin {
    
   
 

    
     
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         // Pedir al usuario que ingrese el primer número del rango
        System.out.print("Ingrese el primer número del rango: ");
        int num1 = scanner.nextInt();
        
        // Pedir al usuario que ingrese el segundo número del rango
        System.out.print("Ingrese el segundo número del rango: ");
        int num2 = scanner.nextInt();
        
        // Validar que el primer número ingresado sea menor que el segundo
        if (num1 >= num2) {
            System.out.println("Error: El primer número debe ser menor que el segundo.");
            return; // Salir del programa si la validación falla
            
         }    
             // Imprimir el rango de números
        System.out.println("El rango de números es:");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
         }    
            
        System.out.println(); // Imprimir una línea en blanco

        // Calcular la suma de los números en el rango
        int suma = 0;
        for (int i = num1; i <= num2; i++) {
            suma += i;
            
          }

        // Imprimir la suma
        System.out.println("La suma de los números en el rango es: " + suma);

        // Cerrar el scanner
        scanner.close();
        
       
    }
    
}

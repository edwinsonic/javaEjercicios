
package ejerciciosbucles22;

import java.util.Scanner;


public class EjerciciosBucles22 {

  
    public static void main(String[] args) {
        /**pedir numeros hasta que se teclee uno negativo,
          y mostrar cuantos numeros se han introducido.**/
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        int contador=0;
        
        System.out.println("introduzca un numero(si es negativo se cierra el programa)");
        
        while(true){
            numero = sc.nextInt();
            
            if(numero<0){
                System.out.println("el numero marcado es: " + numero + "es negativo");
                break;
            }
            contador++;
        
       
        
    }
         System.out.println("los numeros marcados son:" + contador );
         sc.close();
       
    }
    
}

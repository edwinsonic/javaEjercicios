
package ejerciciosbucle24;

import java.util.Scanner;


public class EjerciciosBucle24 {

    
    public static void main(String[] args) {
        /**pedir numeros hasta que se teclee un 0,
          mostrar la suma de todos los numeros introducidos**/
        Scanner sc= new Scanner(System.in);
        
         int numero;
         int suma=0;
         System.out.println("programa para digitar numeros (0, cierra el programa");
         
         do{
             System.out.println("digite un numero:");
             numero=sc.nextInt();
             suma+=numero;
            }
         while(numero!=0);
         System.out.println("la suma de todos los numero digitados es:" + suma);
        
            }
        

    
    }
         
         

             
                     
 
         


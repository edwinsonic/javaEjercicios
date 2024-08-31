
package ejerciciosbucles19;

import java.util.Scanner;


public class EjerciciosBucles19 {

   
    public static void main(String[] args) {
       /** leer un numero y mostrar su cuadrado, repetir
        el proceso hasta que se introduzca un numero negativo
        **/
       Scanner sc =new Scanner(System.in);
       
       
       int numero, cuadrado;
        System.out.println("introduzca un numero");
        numero = sc.nextInt();
        
       while( numero>=0){
           cuadrado= numero*numero;
           System.out.println("el cuadrado de:" + numero + "es" + cuadrado);
           
            System.out.println("introduzca un numero");
            numero = sc.nextInt();
       
        
           
       }
       
       
    }
    
}

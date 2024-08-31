
package ejerciciosbucles21;

import java.util.Scanner;


public class EjerciciosBucles21 {

    

    public static void main(String[] args) {
        /** leer numeros hasta que se introduzca un cero.
         para cada uno indicar si es par o impar**/
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("introduzca un numero para saber si es par o impar");
        numero = sc.nextInt();
                
        while(numero!=0){
            
            if(numero % 2 ==0){
                
                System.out.println("el numero: " + numero + "es par");
            
            }else{
                System.out.println("el numero: " + numero + "es impar");
            
            }
         System.out.println("introduzca un numero para saber si es par o impar");
        numero = sc.nextInt();
        
        }
         
    }
    
}

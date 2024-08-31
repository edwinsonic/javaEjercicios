
package ejerciciosbules30;

import java.util.Scanner;


public class EjerciciosBules30 {

    
    public static void main(String[] args) {
        /** pedir un numero y calcular su factorial**/
        
        Scanner sc = new Scanner(System.in);
        
        int producto=1;
        int n;
        System.out.println("introduzca un numero entero positivo:");
        
        n= sc.nextInt();
        
        for(int i=n; i>=1 ;i--){
            
            producto*=i;
           
        }
         System.out.println("el factorial de:" + n + "es igual a:" + producto);
        
    }
    
}

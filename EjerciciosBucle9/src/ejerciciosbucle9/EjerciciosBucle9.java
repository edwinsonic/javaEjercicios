
package ejerciciosbucle9;

import java.util.Scanner;


public class EjerciciosBucle9 {

    
    public static void main(String[] args) {
        /**crear un programa que tome dos numeros y diga
        si ambos son pares o impares**/
        Scanner sc =new Scanner(System.in);
        
        System.out.println("introdusca un numero entero positivo:");
        int num1 = sc.nextInt();
        
        System.out.println("introduzca un numero entero positivo:");
        int num2 = sc.nextInt();
        
        boolean esNumeroPar1=(num1%2==0);
        boolean esNumeroPar2=(num2%2==0);
        
        if( esNumeroPar1 && esNumeroPar2){
            System.out.println("el numero: " + num1 + " y el numero: " + num2 + " son pares");
           
        }else if(! esNumeroPar1 && !esNumeroPar2){
            System.out.println("el numero: " + num1 + " y el numero: " + num2 + " son inpares");
        }else{
            System.out.println("uno de los numeros digitados es impar  y el otro es par");
        }
        sc.close();
        
        
        
    }
    
}

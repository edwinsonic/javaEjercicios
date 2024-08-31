
package ejerciciosbucle8;

import java.util.Scanner;


public class Ejerciciosbucle8 {

    
    public static void main(String[] args) {
        /**hacer un programa que tome 2 numeros
         y diga si ambos son pares o impares**/
        Scanner sc = new Scanner(System.in);
        
       int num1;
       int num2;
       
        System.out.println("ingrese el primer digito:");
        num1=sc.nextInt();
        System.out.println("ingrese el segundo digito");
        num2=sc.nextInt();
        
        if(num1>num2){
            System.out.println("el numero: " + num1 + "es mayor al numero: " + num2);
        
        }else if(num1<num2){
            System.out.println("el numero: " + num1 + "es menor que el numero: "  + num2);
        }else{
            System.out.println("el numero: " + num1 + "y el numero: " + num2 + "son iguales");
        }
    }
    
}

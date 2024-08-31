
package ejerciciosbucles11;

import java.util.Scanner;


public class EjerciciosBucles11 {

    
    public static void main(String[] args) {
        /**pedir 3 numeros y mostrarlos ordenados de 
         mayor a menor**/
         
        Scanner sc= new Scanner(System.in);
        
           System.out.println("escriba el primer numero: ");
        int num1=sc.nextInt();
        System.out.println("escriba el segundo numero: ");
        int num2=sc.nextInt();
        System.out.println("escriba el tercer nuemro: ");
        int num3=sc.nextInt();
        
        if(num1>num2&& num2>num3){
            System.out.println("orden: " + num1 + " - " + num2 + " - " + num3);
            
        }
        else if(num1>num3 && num3>num2){
            System.out.println("orden: " + num1 + " - " + num3 + " - " + num2);
        }
        else if(num2>num1  && num1>num3){
            System.out.println("orden: " + num2 + " - " + num1 + " - " + num3);
        }
        else if(num2>num3 && num3>num1){
            System.out.println("orden: " + num2 + " - " + num3 + " - " + num1);
        }
        else if(num3>num2 && num2>num1){
            System.out.println("orden: " + num3 + " - " + num2 + " - " + num1);
        }
        else{
            System.out.println("orden: " + num3 + " - " + num1 + " - " + num2);
        
       
        }
    }
    
}

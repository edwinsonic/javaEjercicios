
package ejerciciosbucles4;

import java.util.Scanner;


public class EjerciciosBucles4 {

    
    public static void main(String[] args) {
        /**pedir  dos numeros e indicar cual es el mayor
        si los 2 son iguales**/
       Scanner sc= new Scanner(System.in);
       int num1;
       int num2;
       
        System.out.println("ingrese un numero entero positivo: ");
        num1=sc.nextInt();
        System.out.println("ingrese otro numero entero positivo: ");
        num2 = sc.nextInt();
        
        if(num1>num2){
            System.out.println(num1 +"es mayor que:"+ num2);
            
            
        }else if(num1<num2){
            System.out.println(num1 +"es menor que :"+ num2);
        }else{
            System.out.println("ambos numeros son iguales");
        }
        
            sc.close();
        }
    }    
    


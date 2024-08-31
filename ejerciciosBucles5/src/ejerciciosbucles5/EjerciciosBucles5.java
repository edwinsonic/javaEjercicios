
package ejerciciosbucles5;

import java.util.Scanner;

public class EjerciciosBucles5 {

    
    public static void main(String[] args) {
       /**hacer un programa que lea un caracter por teclado
        y compruebe sies una letra mayuscula**/
       Scanner sc = new Scanner(System.in);
       
       char caracter ;
       
        System.out.println("escriba aqui una letra:");
        caracter= sc.next().charAt(0);
        
        if( Character.isUpperCase(caracter)){
            System.out.println("el caracter: " +caracter + " es una letra mayuscula");
        }else{
            System.out.println("el caracter: " +caracter + " es una letra minuscula");
        }
         sc.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomayorque;

import java.util.Scanner;

/**
 *
 * @author edwin
 */
public class EjercicioMayorQue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*pedir por teclado 2 numerose indicar si uno es mayor que otro
        o si son iguales
         */
        Scanner sn = new Scanner(System.in);
        
        System.out.println(" escriba aqui el primer numero: ");
        int num1 = sn.nextInt();
        
        System.out.println(" escriba aqui el segundo numero: ");
        int num2 = sn.nextInt();
        
        if(num1<=num2){
            
            if(num1==num2){
                System.out.println("el numero: " +num1+ " es igual que: " +num2);
            }else{
                System.out.println("el numero: " +num2+ " es el mayor");
            }
            
            
        }else{
            System.out.println("el numero:" +num1+ "es el mayor");
        }
    }
    
}

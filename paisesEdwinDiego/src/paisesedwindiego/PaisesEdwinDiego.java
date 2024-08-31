/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paisesedwindiego;

import java.util.Scanner;
 
        
public class PaisesEdwinDiego {
    
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        //solicutar al usuario ingresar el nombre del pais
        
        System.out.print("ingrese el nombre del pais: ");
        String pais = scanner.nextLine();
        
        //solicitar al usuario ingresar la cantidad de veces a imprimir
        
        System.out.print("Ingrese la cantidad de veces que desea imprimir el pais: ");
        int cantidad = scanner.nextInt();
        
        
        //imprimir el nombre del pais la cantidad de veces especificada
        
        for(int i=0;  i < cantidad; i++){
            System.out.println(pais);
        
        }
        
        //cerrar scanner
        
        scanner.close();
    
    }
 }
    
    


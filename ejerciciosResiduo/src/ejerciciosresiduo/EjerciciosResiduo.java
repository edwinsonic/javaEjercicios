
package ejerciciosresiduo;

import java.util.Scanner;


public class EjerciciosResiduo {

   
    public static void main(String[] args) {
        /*indicar si un numero pasado por consola es par o no
        
        */
        
        Scanner sn= new Scanner(System.in);
        
        System.out.println("escriba aqui un numero: ");
        
        int Num=sn.nextInt();
        
        if(Num%2==0){
            System.out.println("el numero marcado " +Num+ " es par");
        }else{
            System.out.println(" el numero marcado " +Num+ " es impar");
                    
        }
        
    }
    
}

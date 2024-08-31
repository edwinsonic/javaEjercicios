
package ejerciciosbucles23;

import java.util.Random;
import java.util.Scanner;


public class EjerciciosBucles23 {

   
    public static void main(String[] args) {
       /**realizar un juegopara adivinar un numero.
         para ello generar un numero aleatorio entre o-100,
         y luego ir pidiendo numeros indicando " es mayor" O
         "es menor" segun sea mayor o menor con respecto
         a N. El proceso termina cuando el usuario acierta y
         mostrar el numero de intentos **/
       
       Scanner sc = new Scanner(System.in);
       Random random = new Random();
       
       int numero=-1 ;
       int aleatorio =random.nextInt(101);
       int contador = 0;
        
        System.out.println("juego (adivina el numero)");
        System.out.println("escribe un numero de 0 al 100 para ver si adivinas");
        
        while (aleatorio!=numero){
            
            System.out.println("introduce un numero para adivinar:");
            numero=sc.nextInt();
            
            contador++;
            
            if(aleatorio>numero){
                System.out.println("es menor al numero a adivinar");
            }
                
            else if (aleatorio<numero){
                System.out.println("es mayor al numero a adivinar");
            
           }else{
                System.out.println("felicidades usted acerto al numero");
                System.out.println("el numero de veces digitadas es:" + contador);
            }
        
        }    
        sc.close();
    }              
} 

   
    

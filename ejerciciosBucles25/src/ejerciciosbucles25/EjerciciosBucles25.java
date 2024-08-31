
package ejerciciosbucles25;

import java.util.Scanner;


public class EjerciciosBucles25 {

    
    public static void main(String[] args) {
        /**pedir numeros hazta que se introduzca uno
          negativo y calcular la media**/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("programa para introducir numeros (un numero negativo cierra el programa");
        int numero;
        int contador=0;
       
        int sumatoria=0;
        while(true){
            numero=sc.nextInt();
            if(numero<0){
                System.out.println("el numero digitado es:"+ numero + "es negativo fin del programa");
                break;
                
            }
            contador++;
            sumatoria+=numero;
           
        }
          
           if (contador>0){
               double media = (double)sumatoria/contador;
               System.out.println("el numero de intentos fue:" + contador);
               System.out.println("la media de los numeros digitados es:"+ media);
               
           }else{
            
               System.out.println("no se ingresaron numeros positivos");
           }
           sc.close();
    }
    
    
}

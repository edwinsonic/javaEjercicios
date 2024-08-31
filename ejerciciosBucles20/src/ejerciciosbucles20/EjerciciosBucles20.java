
package ejerciciosbucles20;

import java.util.Scanner;


public class EjerciciosBucles20 {

    
    public static void main(String[] args) {
        /**leer un numero e indicar si es positivo o negativo
       el proceso se repetira hasta que se introduzca un cero**/
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        while (true){
            
            System.out.println("introduzca un numero para saber si es positivo o negativo: ");
            numero = sc.nextInt();
            
            if(numero>0){
                System.out.println("El numero:" + numero + "es positivo");
            }
                else if( numero<0){
                    System.out.println("El numero " + numero + "es negativo");
                
            }else{
                    System.out.println("numero mal digitado");
                    
                   
                    break;
                }
            
        }
         
    }
}    


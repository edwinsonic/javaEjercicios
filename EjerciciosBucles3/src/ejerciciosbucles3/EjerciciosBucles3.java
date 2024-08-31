
package ejerciciosbucles3;

import java.util.Scanner;


public class EjerciciosBucles3 {

    
    public static void main(String[] args) {
        /**crear una aplicacion quue nos permite insertar
        numeros. hasta que insertemos-1**/
        Scanner sc = new Scanner(System.in);
        System.out.println("insertar el numero -1 para terminar el programa ");
        int numero;
        
        do{
            System.out.println("inserte un numero:");
            numero= sc.nextInt();
            if(numero !=-1){
              System.out.println("numero invalido digitar de nuevo");
            }
                        
        }while(numero !=-1); 
        
        System.out.println("programa terminado");
        sc.close();
    }    
}            
            
        
            
     
    
    


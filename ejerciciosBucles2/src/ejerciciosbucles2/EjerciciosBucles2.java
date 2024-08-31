
package ejerciciosbucles2;

import java.util.Scanner;


public class EjerciciosBucles2 {

    
    public static void main(String[] args) {
        /**realizar la suma del 1 al numero que le indiquemos,
         esde debe ser mayorque 1
         **/
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce un numero entero mayor que 1");
        int numero;
        
        do{
            numero = sc.nextInt();
            if(numero<=1){
                System.out.println("valor no valido ingrese un nummero positivo");
            }    
        }while(numero<=1);
             
        int suma=0;
        for( int i =1;i<=numero;i++){
            suma=suma+i;
        }
        System.out.println("lasuma de numeros es"+suma);
             
    }           
}           
        
        
    


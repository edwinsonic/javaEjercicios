
 
package ejerciciosbucles34;

import java.util.Scanner;


public class EjerciciosBucles34 {

    
    public static void main(String[] args) {
        /**pide un numero que debe estar (entre 0 y  10)y
          mostrarla tabla de multiplicar de dicho numero
         **/
        Scanner sc=new Scanner(System.in);
        int numero;
        int tablaMultiplicar=1;
        System.out.println("escribe un numero entre el 0 y 10:");
         numero= sc.nextInt();
         
         if(numero<0 || numero>10){
             System.out.println("numero incorrecto vuelva a digitar un numero");
             
             
         }else{
             System.out.println("la tabla de multiplicar del numero:" + numero   );
             for( int i=1; i<13; i++){
                tablaMultiplicar=numero*i;
                 
                 System.out.println( numero + " x " + i + " es " + tablaMultiplicar);
             }
             }
         
             
        
    }
    
}

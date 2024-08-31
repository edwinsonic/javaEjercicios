
package ejerciciosbucles32;

import java.util.Scanner;


public class EjerciciosBucles32 {

    
    public static void main(String[] args) {
        /**Pedir 10 sueldos y mostrar su suma.Mostrar cuantos hay mayores a $1000**/
        Scanner sc =new Scanner(System.in);
        
        double sueldos=0;
       double sumaSueldos=0;
       int conteoMayoresMil=0;
       
       for (int i=0; i<=10; i++){
           
           System.out.println("escriba un sueldo:");
           sueldos=sc.nextDouble();
             sumaSueldos+=sueldos;
         if(sueldos>1000){
             conteoMayoresMil++;
         
         
             
             
         }
       }
      
        System.out.println("la cantidad de sueldos mayores a mil dolares es: " + conteoMayoresMil + " sueldos");
        System.out.println("la suma de los sueldos digitados es:" + sumaSueldos);
        if(conteoMayoresMil==0){
            System.out.println("no existen sueldos mayores a mil dolares");
        }
    }
    
}

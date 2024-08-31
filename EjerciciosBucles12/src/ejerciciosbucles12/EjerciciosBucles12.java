
package ejerciciosbucles12;

import java.util.Scanner;


public class EjerciciosBucles12 {

    
    public static void main(String[] args) {
        /**pedir el dia, mes y año de una fecha e indicar 
          si la fecha es correcta.suponiendo que todos los meses
          son de 3o dias**/
        
        Scanner sc = new Scanner(System.in);
        
        int dia;
        int mes;
        int año;
        
        System.out.println("escriba el dia de su nacimiento en numero");
        
         dia = sc.nextInt();
         
        System.out.println("escriba el mes de su nacimiento en numero");
        
         mes = sc.nextInt();
         
        System.out.println("escriba el año de su nacimiento en numero");
        
         año = sc.nextInt();
         
         
         if(dia>=1 && dia<=30&& mes>=1&& mes<=12 && año <=2024){
             System.out.println("la fecha es correcta");
             
         }else{
             System.out.println("la fecha es incorrecta");
             
            
         }
         
           sc.close();
         
        
    }
    
}

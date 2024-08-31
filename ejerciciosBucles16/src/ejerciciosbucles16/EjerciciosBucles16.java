
package ejerciciosbucles16;

import java.util.Scanner;

public class EjerciciosBucles16 {

    
    public static void main(String[] args) {
        /**pedir una nota de cero a 10
    y mostrarla en forma:insuficiente,suficiente y bien, 
    * notable y sobresaliente**/
    Scanner sc = new Scanner(System.in);
    Double nota;
        System.out.println("sistema de estado decalificaciones");
        
        System.out.println("ingrese su nota del 0 al 10");
        
          nota = sc.nextDouble();
          
          if(nota>=0 && nota<=3){
              
              System.out.println("nota insuficiente");
              
              
          }else if(nota>=4 && nota<=5){
              
              
              System.out.println("nota suficiente");
              
          }else if(nota>=6 && nota<=8){
              
              System.out.println("nota bien");
              
          }else if(nota>=9 && nota<=10){
              
                System.out.println("nota  exelente");
              
              
          }else{
              System.out.println(" nota invalida intentar de nuevo");
          }
    
    }    
            
    
  
}
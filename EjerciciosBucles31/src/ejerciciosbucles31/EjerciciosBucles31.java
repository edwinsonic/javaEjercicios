
package ejerciciosbucles31;

import java.util.Scanner;


 
public class EjerciciosBucles31 {

    
    public static void main(String[] args) {
       /**pedir 10 numeros y mostrar la media  de los numeros
       positivos,la mediade los numeros negativos y la cantidad de ceros.**/
       Scanner sc = new Scanner(System.in);
       
       int numeros;
       double mediaPositivos=0;
       int sumaPositivo=0;
       double mediaNegativos=0;
       int sumaNegativo=0;
       int contadorCeros=0;
       int conteoPositivos=0;
       int conteoNegativos=0;
       
       for (int i=1; i<=10; i++){
           
           System.out.println("escribir 10 numeros:" );
           
           numeros=sc.nextInt();
           
           if(numeros==0){
               
              contadorCeros++; 
          }
           
           else if (numeros>0){
              
               sumaPositivo+=numeros;
               conteoPositivos++;
               
           }
           else{
               sumaNegativo+=numeros;
               conteoNegativos++;
           }
       }
        System.out.println("el total de numeros ceros es:" + contadorCeros);
        System.out.println("el total de numeros positivos es: " + conteoPositivos);
        System.out.println("el total de numeros negativos es: " + conteoNegativos);

       if(conteoPositivos==0){
           System.out.println("no se puede sacar la media de los positivos por falta de positivos");
       }else{
       mediaPositivos=(double)sumaPositivo/conteoPositivos;
       System.out.println("y la media de los numeros positivos es: " + mediaPositivos);}
       
       if(conteoNegativos==0){
           System.out.println("no se puede sacar la media de los negativos por falta de negativos");
       }else{
       mediaNegativos=(double)sumaNegativo/conteoNegativos;
       System.out.println("y la media de los numeros negativostivos es: " + mediaNegativos);}
        
    }    }   
        
        
        
        
  
   
    


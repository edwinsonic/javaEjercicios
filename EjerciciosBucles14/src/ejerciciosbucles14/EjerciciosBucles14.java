
package ejerciciosbucles14;

import java.util.Scanner;


public class EjerciciosBucles14 {

    
    public static void main(String[] args) {
        /**construir un programa que simule el funcionamiento de una calculadora
         que puede realizar las 4 operaciones arimeticas basicas(suma, resta, producto y divicion
         * ) con  valores enteros numericos enteros. el usuario debe especificar la iperacion
         *  con el caracter del primer parametro de la linea de comandos s oS para 
         * la suma, R o r para la resta, M o m para la multiplicacion y D o d 
         * para la divicion.**/
         Scanner sc = new Scanner(System.in);
         
         Double num1, num2;
        
         System.out.println("escriba su primer numero: ");
         num1=sc.nextDouble();
         
         System.out.println(" escriba su segundo numero: ");
         num2 = sc.nextDouble();
         
         sc.nextLine();
         
         System.out.println("escriba aqui su operacion en letras: String S; //suma\n" +
         "R; //resta\n" +
         "D; // ddivivion\n" +
          "M; //lultiplicacion\n");
          
         String  operacion =sc.nextLine().toUpperCase();
            
                  switch(operacion){
                      case "S" :
                          System.out.println("el ressultado de la suma es " +(num1 + num2));
                          
                          break;
                       
                      case "R" :
                          
                           System.out.println("el ressultado de la resta es " +(num1 - num2));
                           
                           break;
                           
                      case "M" :
                          
                           System.out.println("el ressultado de la multiplicacion es " +(num1 * num2));
                           
                           break;
                           
                      case "D" :
                          
                          if( num2!= 0){
                             
                            System.out.println("el ressultado de la divicion es " +(num1 / num2));
                            
                              
                          }else{
                              
                              System.out.println("el segundo numero que a colocado es cero y no se realiza la divicion");
                              
                              
                          }
                         
                           break;
                           
                           default :
                               
                               System.out.println("error en la eleccion de operacion");
                  }
         
         
         
         
         
    }
    
}

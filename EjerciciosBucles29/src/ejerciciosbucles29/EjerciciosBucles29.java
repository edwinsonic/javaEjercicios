
package ejerciciosbucles29;

import java.util.Scanner;


public class EjerciciosBucles29 {

    
    public static void main(String[] args) {
        /**Diseñar un programa que muestre el producto de los 10 primeros numeros impares**/
        
        Scanner sc=new Scanner(System.in);
      
        int producto=1;
        
        for(int i=1; i<10; i+=2){
            
            producto=producto*i;
            
            System.out.println(i +" ");
            
        }
        System.out.println("el producto de los 10 primros numeros es :" + producto);
        
        
    }
    
}

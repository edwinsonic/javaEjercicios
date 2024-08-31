
package añobiciesto;

import java.util.Scanner;


public class AñoBiciesto {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int año;
        
        System.out.println("Programa para averiguar si un año es biciesto");
        System.out.println("introduzca el año: ");
        año=scanner.nextInt();
        
        if(año%400==0){
            System.out.println("el año: " + año + " es biciesto");
        }else if(año%100==0){
            System.out.println("el año; " + año + " no es biciesto");
        }else if(año%4==0){
            System.out.println("el año: " + año + " es biciesto");
        }else
            System.out.println("el año; " + año + " no es biciesto");
    }
    
}


package ejerciciosbucles28;

import java.util.Scanner;


public class EjerciciosBucles28 {

    
    public static void main(String[] args) {
        /**pedir  10 numeros y escribir la suma total**/
        Scanner sc=new Scanner(System.in);
        System.out.println("escribir diez numeros para calcular la suma de todos ellos: ");
        int numero;
        int contador=0;
        int suma=0;
        do{
            numero=sc.nextInt();
            contador++;
            suma+=numero;   
        }
        while(contador<10);
        System.out.println("los numeros digitadosson" + contador);
        System.out.println("y la suma de los 10numeros es:" +suma);
    }
    
    
     
}

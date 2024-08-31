
package ejerciciosbucles26;

import java.util.Scanner;


public class EjerciciosBucles26 {

    
    public static void main(String[] args) {
        /**pedir un numero N,y mostrar todos los numeros del 1 al N.**/
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Ingrese un número positivo para mostrar todos los números del 1 hasta ese valor:");
        int numero;

        do {
            numero = sc.nextInt();
        } while (numero <= 0);

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        sc.close();
    }

    }
    


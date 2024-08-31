
package ejerciciofor2;

import java.util.Scanner;


public class EjercicioFor2 {

    
    public static void main(String[] args) {
        /**crear una tablade multiplicar de un numero
         entero positivo"n" comenzando desde el 1
        si el usuario escribe u  numero incorrecto el pro
        grama no se ejecuta en cambio pregubta de nuevo por la informacion
        hasta que el daoingresado sea correcto**/
        Scanner sc = new Scanner(System.in);
        int n;
        boolean comprobar = true;
        
        while(comprobar==true){
            System.out.println("ingrese un numero entero positivo: " );
            n=sc.nextInt();
            if(n>0){
               for(int i=1;i<=12;i++){
                System.out.println(i + "  x " + n + "  es =   " + n*i);
               }
                comprobar=false;
            }
        
            else{
                 System.out.println("numero incorrecto vuelva a intentarlo");
            }
        }
    }
}    
    



 
package ejerciciosbucles33;

import java.util.Scanner;


public class EjerciciosBucles33 {

    
    public static void main(String[] args) {
        /**Dadas las edades y alturas de 5 alumnos,mostrar la edad y la estatura media,
         la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden masde 1.75**/
         
        Scanner sc = new Scanner(System.in);
        
        int edad;
        float altura=0;
        float sumaEstatura=0;
        int contadorDeEstatura=0;
        int contadorDeEdad=0;
        float sumaEdad=0;
        float edadMedia, estaturaMedia;
       
        for (int i =1; i<=5; i++){
            
            System.out.println("Escriba la edad " + i + " aqui:");
            edad= sc.nextInt();
            
            sumaEdad+=edad;
            
            System.out.println("escribe la estatura " + i + " aqui:");
            altura= sc.nextFloat();
            
            sumaEstatura+=altura;
            
            if (altura>1.75){
                contadorDeEstatura++;
            }
            if (edad>18){
                contadorDeEdad++;
            
            }
        }
        edadMedia=(float)sumaEdad/5;
        estaturaMedia=sumaEstatura/5;
        System.out.println("la edad media es: " + edadMedia);
        System.out.println("La estatura media es: " + estaturaMedia);
        System.out.println("la cantidad de alumnos mayores de 18 años es: " + contadorDeEdad);
        System.out.println("la cantidad de alumnos que miden mas de 1.75 es: " + contadorDeEstatura);
    }                
    
}

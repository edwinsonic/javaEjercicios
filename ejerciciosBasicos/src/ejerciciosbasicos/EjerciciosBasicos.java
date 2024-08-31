
package ejerciciosbasicos;


public class EjerciciosBasicos {

   
    public static void main(String[] args) {
        /*dar dos numeros y hacer los sigtes ejercicios:
        suma,resta,multiplicacion, divicion, resto,
        */
        
        int a = 5;
        int b = 2;
        
        int suma = a + b;
        int resta = a -b ;
        int multiplicacion = a*b;
        double divicion = (double)a/b;
        int resto = a%b;
        
        System.out.println("la suma de los numeros a y b es: " + suma);
        System.out.println("la resta de los numeros a y b es: " + resta);
        System.out.println("la multiplicacion de los numeros a y b es: " + multiplicacion);
        System.out.println("la divicion de los numeros a y b es: " + divicion);
        System.out.println("la resto de los numeros a y b es: " + resto);
    }
    
}

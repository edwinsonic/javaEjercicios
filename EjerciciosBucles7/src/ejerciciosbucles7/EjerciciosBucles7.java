
package ejerciciosbucles7;

import java.util.Scanner;


public class EjerciciosBucles7 {

    
    public static void main(String[] args) {
        /**hacer un programa donde un hobrero nesecita calcular su salario
         semanal, el cual se obtiene de la siguiente manera:si trabaja 40 
         horas o menos se le paga $16por hora.
        si trabaja mas de 40 horas se le paga 16 por cada una de las primeras
        40 horas y 20 por cada hora extra **/
         
        Scanner sc =new Scanner(System.in);
        
        int horasTrabajadas;
        int pagoXHoraExtra=20;
        int umbralHora=40;
        int totalPaga;
        int pagoHoraNormal=16;
        int umbralPago;
        int pagoHorasExtra;
        int horasExtra;
        
        
        
         System.out.println("Programa cálculo salario");
        System.out.println("Introduce las horas trabajadas: ");
        
        horasTrabajadas = sc.nextInt();
        
        if (horasTrabajadas < 0) {
            System.out.println("Lo que has digitado no corresponde a lo pedido. Ingrese de nuevo las horas trabajadas.");
        } else if (horasTrabajadas <= umbralHora) {
            totalPaga = horasTrabajadas * pagoHoraNormal;
            System.out.println("Las " + horasTrabajadas + " horas trabajadas se pagan con $" + totalPaga);
        } else {
            umbralPago = pagoHoraNormal * umbralHora;
            horasExtra = horasTrabajadas - umbralHora;
            pagoHorasExtra = horasExtra * pagoXHoraExtra;
            totalPaga = umbralPago + pagoHorasExtra;
            
            System.out.println("El total de horas extra es: " + horasExtra + " horas");
            System.out.println("El total a pagar, incluyendo horas extra, es: $" + totalPaga);
        }
        
        sc.close();
            
    }
    
}

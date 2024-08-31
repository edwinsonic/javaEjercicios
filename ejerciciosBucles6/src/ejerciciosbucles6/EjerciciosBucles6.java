
package ejerciciosbucles6;

import java.util.Scanner;


public class EjerciciosBucles6 {

    
    public static void main(String[] args) {
        /**en un centro comercial se hace un descuento del 30% alos clientes
         cuya compra supere los $300 ¿cual sera la cantidad que pagara una persona 
         por su compra?**/
        Scanner sc =new Scanner(System.in);
        double compra;
        double porcentajeDescuento=0.30;
        double limiteDescuento= 300;
        double montoTotal;
        
        System.out.println("introduzca el monto de compra");
        compra= sc.nextDouble();
        
        if(compra>limiteDescuento){
            double descuento = compra*porcentajeDescuento;
            montoTotal= compra-descuento;
            System.out.println("se aplica un descuento de 30%");
            System.out.println("el descuento es de $"+ descuento);
        }else{
            montoTotal =compra;
            System.out.println("no se aplica descuento");
        }
        System.out.println(" el monto total a pagar con descuento es;"+montoTotal);
        sc.close();
         
        
    }
    
}

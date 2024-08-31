
package ejerciciosbucles17;

import java.util.Scanner;



public class EjerciciosBucles17 {

    
    public static void main(String[] args) {
       /**hacer un programa que simile un cajero automatico
        co un saldo inicial de 1000 dolares con el siguiente menu de opciones
        1.- ingresar dinero ala cuenta
        2.-retirar dinero de la cuenta 
        3 salir**/
        Scanner sc = new Scanner(System.in);
        
        Double SaldoInicial = 1000.00;
        
        Double CantidadDepositada,CantidadRetirada;
       int operacion;
     while (true){
         System.out.println("que operacion desea realzar ");
         System.out.println("1.- ver saldo");    
         System.out.println("2.-Depositar dinero");
         System.out.println("3.- Retirar Dinero");
         System.out.println("4.- Salir");
               
        
       
       
        System.out.println("escriba el numero de operacion: ");
        operacion = sc.nextInt();
        
        
        
        switch (operacion) {
            case 1 : {
                System.out.println("su cuenta tiene $/" + SaldoInicial + "dolares");
                
                break;
            }
            
            case 2 : {
                
                System.out.println(" ingrese la cantidad de dinero a depositar: ");
                CantidadDepositada = sc.nextDouble();
                SaldoInicial+=CantidadDepositada;
                
                System.out.println("la cantidad depositada es: $/" + CantidadDepositada
                        +"y su saldo es : $/" + SaldoInicial);
                
                break;
                
            }
            
            case 3 : {
                
                 System.out.println(" ingrese la cantidad de dinero a retirar: ");
                CantidadRetirada = sc.nextDouble();
                
                if(CantidadRetirada <= SaldoInicial){
                    SaldoInicial-=CantidadRetirada;
                
                System.out.println("la cantidad retirada es: $/" + CantidadRetirada +
                        "y su saldo es : $/" + SaldoInicial);
                
            }else{
                    System.out.println("no tiene saldo suficiente para retirar esa cantidas");
                    
                    break;
                }
                    
            
            }
                
            case 4 : {
            
            System.out.println("gracias por usar este cajejo automatico");
            
            sc. close ();
            
            return;
                
            }
            
            default:
                System.out.println("numero de operacion incorrecto");
                
                
              
                
                        
                
                       
                      
                
            
        }
        
       
    }
    
}}

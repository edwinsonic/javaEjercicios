
package ejerciciosbucles13;

import java.util.Scanner;


public class EjerciciosBucles13 {

    
    public static void main(String[] args) {
         /**pedir el dia, mes y año de una fecha e indicar 
          si la fecha es correcta. Con meses de 28, 20 y 31 dias
          sin años biciestos.**/
          
             Scanner sc = new Scanner(System.in);
        
        int dia;
        int mes;
        int año;
        
        System.out.println("escriba el dia de su nacimiento en numero");
        
         dia = sc.nextInt();
         
        System.out.println("escriba el mes de su nacimiento en numero");
        
         mes = sc.nextInt();
         
        System.out.println("escriba el año de su nacimiento en numero");
        
         año = sc.nextInt();
         
         boolean fechaCorrecta = false;
         
         if(mes>=1 && mes<=12){
             
             switch(mes){
                 
                 case 1:  //Enero
                 case 3:  //marzo
                 case 5:  //mayo
                 case 7:  //julio
                 case 8:  //agosto
                 case 10: //octubre
                 case 12: //diciembre
                         if(dia>=1 && dia<=31){
                             fechaCorrecta = true;
                                    
                             
                         } break;
                  
                 case 4:  //abril
                 case 6:  //junio
                 case 9:  //setiembre
                 case 11: //noviembre
                     if(dia>=1 && dia<=30){
                         fechaCorrecta = true;
                     } break;
                 
                 case 2:  //febrero
                     if(dia>=1 && dia<= 28){
                         fechaCorrecta = true;
                         
                     } break;
                  
         




             }
             if(fechaCorrecta){
                 System.out.println("la fecha que usted a marcado  es correcta");
             }else{
                 System.out.println("fecha es invalida");
             }
             sc.close();
        
         }
    }    }


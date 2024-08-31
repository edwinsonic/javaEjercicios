package ejerciciosbucles18;

import java.util.Scanner;

public class EjerciciosBucles18 {

    public static void main(String[] args) {
        /**hacer un programa que pase de kg a otra unidad de
         medida de masa, mostrar en pantalla un menú con las opciones 
         posibles**/

        Scanner sc = new Scanner(System.in);

        int opciones;
        double kilosObtenidos, gramosObtenidos, toneladasObtenidas;
        double onzasObtenidas, librasObtenidas;

        while (true) {

            System.out.println("Programa de convertir kilos a"
                    + " otras unidades de masa");
            System.out.println("(1) de kilos a gramos");
            System.out.println("(2) de kilos a toneladas");
            System.out.println("(3) de kilos a onzas");
            System.out.println("(4) de kilos a libras");
            System.out.println("(5) salir del sistema");
            
            
        

            System.out.println("Escriba el número de operación a realizar:");
            opciones = sc.nextInt();
            
           if (opciones==5) {
                
                System.out.println(" salir del sistema");
                break;
            
            }
            System.out.println("Introduce el número de kg a convertir:");
            kilosObtenidos = sc.nextDouble();
            switch (opciones) {

                case 1: {
                    gramosObtenidos = kilosObtenidos * 1000;
                    System.out.println("Los " + kilosObtenidos + " kg se convierten en: " + gramosObtenidos + " gramos");
                    break;
                }
                case 2: {
                    toneladasObtenidas = kilosObtenidos / 1000;
                    System.out.println("Los " + kilosObtenidos + " kg se convierten en: " + toneladasObtenidas + " toneladas");
                    break;
                }
                case 3: {
                    onzasObtenidas = kilosObtenidos * 35.274;
                    System.out.println("Los " + kilosObtenidos + " kg se convierten en: " + onzasObtenidas + " onzas");
                    break;
                }
                case 4: {
                    librasObtenidas = kilosObtenidos * 2.20462;
                    System.out.println("Los " + kilosObtenidos + " kg se convierten en: " + librasObtenidas + " libras");
                    break;
                
                }
                default: {
                    System.out.println("El número de operación no es válido");
                    break;
                }
            }
          
        }
          sc.close();
    }
}

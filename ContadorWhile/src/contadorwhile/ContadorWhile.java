/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorwhile;

/**
 *
 * @author edwin
 */
public class ContadorWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador=0;
        while (contador<=10) {
            System.out.println("Estoy en la vuelta n:" +contador);
            contador= contador+1;
        }
    }
    
}

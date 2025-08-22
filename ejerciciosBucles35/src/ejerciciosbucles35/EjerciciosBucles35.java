package ejerciciosbucles35;


import java.util.Scanner;


public class EjerciciosBucles35 {

    
    public static void main(String[] args) {
        /**una empresa que se dedicaala venta de desinfectantes nesecita un programa 
        para gestionar sus facturas. En cada factura figura: el codigo delarticulo,
        la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas
        introducidas: Facturacion total, cantidad de litros vendidos del articulo 1
        y cuantas facturas se emitieron de mas de  $600.
         **/
        Scanner sc = new Scanner(System.in);
        
        float codigoArticulo,precioXlitro=0,facturacionTotal=0,litrosArticuloUno=0,cantidadLitrosVendido=0;
        float sumatoriaFacturas=0,facturas=0;
        int facturasDeSeiscientos=0;
        
        System.out.println("PROGRAMA DE GESTION DE FACTURAS");
        
        for(int i=1; i<=5; i++){
            System.out.println("Escribe el codigo del articulo" + i + ":");
            codigoArticulo=sc.nextFloat();
            System.out.println("Escribe la cantidad de litros de desinfectante vendido del articulo" + i + " : ");
            cantidadLitrosVendido=sc.nextFloat();
            System.out.println("Escribe el precio por litro del articulo" + i + " : $ ");
            precioXlitro=sc.nextFloat();
            facturas=cantidadLitrosVendido *precioXlitro ;
            sumatoriaFacturas+=facturas;
            
            
            
            
            if(codigoArticulo ==1){
                litrosArticuloUno=cantidadLitrosVendido;
            
           
            }if (facturas>600){
            facturasDeSeiscientos++;
           
        
                    
        }
        
        
        
        }
        System.out.println("la facturacion total es:$" + sumatoriaFacturas);
        System.out.println("la cantidad de litros vendidos del articulo 1 es;" + litrosArticuloUno + "litros");
        System.out.println("las facturas de mas de 600 dolares son:" +  facturasDeSeiscientos);
        }
      
}
    


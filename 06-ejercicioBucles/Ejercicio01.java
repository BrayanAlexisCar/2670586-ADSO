import java.util.Scanner;

public class Ejercicio01 {
     public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);


       System.out.print("ingrese el sueldo total : ");
       double sueldo =  Entrada.nextInt();
       
       System.out.println("cantidad de pagos: ");
       int CantidadPagos =  Entrada.nextInt();


        System.out.println("-------------- FORMAS DE PAGO ----------------- ");    
        System.out.println("           1. Pagos de igual valor");    
        System.out.println("           2. Primer pago diferente.");    
        System.out.println("           3. Ultimo pago diferente. ");    
        System.out.println("           4. Primer y Ultimo pago diferente. "); 
        System.out.println("ingrese la forma de pago:");
        int formapago =  Entrada.nextInt();



        if (formapago == 1) {
            double pagoIgualvalor = sueldo / CantidadPagos;
            for (int i = 1; i <= CantidadPagos; i++){

              System.out.println("mes " + i  + ": $ " + pagoIgualvalor);    
            
            }

        }else if ( formapago == 2){
             System.out.print("Ingrese el valor del primer pago: ");
             double primerpago = Entrada.nextDouble();
             double pagosobrante = (sueldo - primerpago) / (CantidadPagos - 1);
            System.out.println("Mes 1: $ " + primerpago);
             for(int i = 2; i <= CantidadPagos; i++){
                 System.out.println("mes " + i  + ": $ " + pagosobrante); 
             }

        }else if(formapago == 3){
            System.out.println("ingrese el valor del ultimo pago");
            double ultimopago =Entrada.nextDouble();
            double sobranteUltimopago = (sueldo - ultimopago) / (CantidadPagos - 1);
              for(int i = 1; i < CantidadPagos; i++){
                 System.out.println("mes " + i  + ": $ " + sobranteUltimopago); 
             

             }
        }else if (formapago == 4) {
            System.out.print("Ingrese el valor del primer pago: ");
            double primerPago = Entrada.nextDouble();
            System.out.print("Ingrese el valor del último pago: ");
            double ultimoPago = Entrada.nextDouble();
            double sobrantePagos = (sueldo - primerPago - ultimoPago) / (CantidadPagos - 2);
            for (int i = 2; i < CantidadPagos; i++) {
            System.out.println("Mes " + i + ": $" + sobrantePagos);
            }
        }else {
            System.out.println("esa no es una opcion valida.");
        }
    }

}



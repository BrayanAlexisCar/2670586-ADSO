import java.util.Scanner;

public class Ejercicio02{

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);


            int cantidadfechas=1;
            int contador = 0;

        while(contador < cantidadfechas){
            int dia = (int) (Math.random() * 31) + 1;
            int mes = (int) (Math.random() * 12) + 1;
             int anio = (int) (Math.random() * 9999) + 1;


             if(dia > 31){
                dia = 31;

                
             }if (mes > 12){
                mes = 12;
             }
               if (anio < 1000) {
                anio = 1000;
            }

         
            int fecha = (dia * 1000000) + (mes * 10000) + anio  ;
        System.out.println("fecha generada:" + fecha);
            contador++;

         }
        
         
      

    }
}






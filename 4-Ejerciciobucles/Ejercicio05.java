import java.util.Scanner;

public class Ejercicio05{
 
    public static void main(String[] args) {
 
       
       Scanner entrada = new Scanner (System.in);

    
        System.out.println("ingrese un numero:");
        int numero = entrada.nextInt();
        
        int fb1 = 0;
        int fb2= 1;
        int contador = 1;



        while(contador <= numero){

            if (contador == 1){
            System.out.print( fb1 + ",");

        }
        if( contador== 2){
            System.out.print(fb2 + ",");
        }

        if(contador>2){
            int fbactual = fb1 + fb2;
            System.out.print (fbactual + ",");
            fb1 = fb2;
            fb2 = fbactual;
        }

        contador = contador + 1;
        }

        }
    }
 


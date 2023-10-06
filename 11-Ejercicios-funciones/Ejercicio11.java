import java.util.Scanner;

public class Ejercicio11 {
     public static void main(String[]args){

        int numero1 = 4;
        factorial(numero1);

        
        int numero2 = 5;
        factorial(numero2);

        
        int numero3 = 9;
        factorial(numero3);

        
        int numero4 = 12;
        factorial(numero4);

        
        long numero5 = 15;
        factorial(numero5);


      
       


    }


    public static void factorial(long numero){
    long facto = 1;
    for (int i = 1; i <= numero; i++) {
            facto = facto *i;
            
        }

        System.out.println("El factorial es: " +facto);
         System.out.println();
    }
}
   





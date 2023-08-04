import java.util.Scanner;

public class Ejercicio06 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese un número: ");
      int numero = scanner.nextInt();

      int array [] = new int [numero];
      int noprimos [] = new int [numero];
      int primo [] = new int [numero];
      int contprimo = 0;
      int contnoprimo = 0;


     
       System.out.print("arreglo original: " );
        for (int i = 1; i <= numero; i++) {
            System.out.print( + i+ ",");
          
        }
        System.out.println();


        
         
         for (int i = 1; i <= i; i++) {
           int divisores = 0;
            if (numero % i == 0) {
               divisores++;
                
            }
             if ( divisores == 2){
           primo[contprimo] = i;
          contprimo++;
         }else{
          noprimos[contnoprimo] = i;
          contnoprimo++;
         }

       }
        
   


    System.out.print("arreglo primos: " );
        
   for (int i = 0; i < contprimo; i++) {
           System.out.println(primo[i]);
            }
    
       System.out.println();

        // Imprimir los números no primos
        System.out.print("Arreglo no primos: ");
        for (int i = 0; i <= contnoprimo; i++) {
            System.out.print(noprimos[i] +" ,");
            
            
            
        }
        System.out.println();

     
  
    }
     
   

   }
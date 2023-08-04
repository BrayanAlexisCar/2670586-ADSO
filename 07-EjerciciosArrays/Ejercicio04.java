import java.util.Scanner;

public class Ejercicio04{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

       
      System.out.print("Ingrese un número para el tamaño del arreglo: ");
      int numero = scanner.nextInt();

      int array [] = new int [numero];


        System.out.print("arreglo original: " );
        for (int i = 0; i <= numero; i++) {
            System.out.print( + i+ ",");
          
        }
        System.out.println();

        System.out.print("arreglo descendente: " );
        int i ;
        for(  i = numero ; i >= 0; i-- ){
            System.out.print( + i + ","  );
        }


      

    }
     
  

  }
  

  









  
    




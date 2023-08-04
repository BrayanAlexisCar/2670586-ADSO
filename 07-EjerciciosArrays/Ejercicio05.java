import java.util.Scanner;

public class Ejercicio05{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

       
      
    System.out.print("Ingrese un número para el tamaño del arreglo: ");
    int numero = scanner.nextInt();
    int array [] = new int [numero];
      
      for(int i = 0; i < numero; i++){
        System.out.print(" diga el numero: ");
        array[i] = scanner.nextInt();
      }
  
      System.out.print("arreglo: " );
      for (int i = 0; i < numero; i++) {
          System.out.print( array[i] +  ",");
      }

        System.out.print( " }");
        System.out.println();
        System.out.print("Ingrese un numero de movimientos: ");
        int movimientos = scanner.nextInt();




        for( int mov = 1; mov <= movimientos ; mov++){
            

            int aux = array[0];
            for (int i = 0; i< numero - 1; i++){
              array[i] = array[i + 1];

            }
            array[numero - 1] = aux;

            System.out.print("movimiento" +mov+ ": { ");

            for( int i = 0; i < numero; i++){
              System.out.print( array[i] + " ");
            }
           System.out.println();
        
            }
            
            System.out.println(" }");
            System.out.println();

    }
        
  }

     
     
       


      

    
    
  

  
  

  









  
    




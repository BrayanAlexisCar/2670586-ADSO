import java.util.Scanner;

public class Ejercicio03{
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

    System.out.println();

    System.out.print("Ingrese una posicion: ");
    int posicion = scanner.nextInt();
    System.out.println( array[posicion]);
    System.out.print("antihorario: ");
    System.out.print(" { ");


    for ( int i = posicion; i >= 0; i--){
      System.out.print(array[i] + " -");
    }
        
    for( int  i = numero - 1; i > posicion; i-- ){
        System.out.print(array[i] + " - "  );
    }
    System.out.print("  } ");

  }
}
  

  









  
    



import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int[] array = new int[numero * numero];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Imprimir la cuadrícula en zigzag
        System.out.println("Cuadrícula en zigzag:");
        int fila = 0;
        int col = 0;
         int limite = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print( "["+ array[col + fila * numero] + "]");
            
            if (fila % 2 == 0) {
                col++;
                if (col == numero) {
                    fila++;
                    col--;
                }
                
                // si es imparr
            } else {
                col--;
                if (col < 0) {
                    fila++;
                    col++;
                }
            }
            limite++;

            if (limite == numero) {
                System.out.println(); 
                limite = 0; 
            }
        }
    }
}

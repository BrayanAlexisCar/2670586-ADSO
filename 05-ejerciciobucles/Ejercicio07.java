import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int numero;
        System.out.print("Ingrese un número impar: ");
        numero = scanner.nextInt();

        int contador = 1;
        int mitad = numero / 2;

        for (int i = 0; i < numero; i++) {
            int espacios = mitad - i;
            if ( espacios < 1){
                espacios *= -1;
            }
          
            
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < contador; k++) {
                System.out.print("x");
            }

            System.out.println();

            if (i < mitad) {
                contador += 2;
            } else {
                contador -= 2;
            }
        }
    }
}

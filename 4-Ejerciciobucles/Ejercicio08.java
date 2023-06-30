import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número maximo 6 dígitos: ");
        int numero = scanner.nextInt();

        System.out.println("------------------------------------");
        int posicion = 1;
        int divisor = 100000;

        while (divisor>= 1) {
            
           int digito =( numero / divisor ) % 10;

            System.out.println("El dígito " + posicion + " es: " + digito);
            divisor /= 10;
            posicion++;
        }
    }
}



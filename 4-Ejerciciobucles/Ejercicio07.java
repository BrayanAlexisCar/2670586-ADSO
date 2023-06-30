import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        int mcm = 1;
        int divisor = 2;

        while (numero1 > 1 || numero2 > 1 || numero3 > 1) {
            if (numero1 % divisor == 0 || numero2 % divisor == 0 || numero3 % divisor == 0) {
                mcm *= divisor;

                if (numero1 % divisor == 0) {
                    numero1 /= divisor;
                }
                if (numero2 % divisor == 0) {
                    numero2 /= divisor;
                }
                if (numero3 % divisor == 0) {
                    numero3 /= divisor;
                }
            } else {
                divisor++;
            }
        }

        System.out.println("El MCM es: " + mcm);
    }


}






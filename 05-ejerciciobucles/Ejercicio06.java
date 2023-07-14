import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;

        System.out.print("Ingrese un número N: ");
        n = scanner.nextInt();

        System.out.print("Ingrese un número M: ");
        m = scanner.nextInt();

        for (int i = n; i <= m; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println("Factorial de " + i + " (" + i + "!):");
            System.out.print("1");
            for (int k = 2; k <= i; k++) {
                System.out.print(" x " + k);
            }
            System.out.println(" = " + factorial);
        }
    }
}
 


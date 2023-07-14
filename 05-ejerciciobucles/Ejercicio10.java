import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número N: ");
        int numero = entrada.nextInt();

        System.out.println("Cuadrado latino:");

        for (int i = 1; i <= numero; i++) {
            int valor = i;
            for (int j = 1; j <= numero; j++) {
                System.out.print(valor + " ");
                valor = valor % numero + 1;
            }
            System.out.println();
        }
    }
}
